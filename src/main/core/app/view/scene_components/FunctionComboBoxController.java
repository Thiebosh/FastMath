package core.app.view.scene_components;

import core.app.data.ExpressManager;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import java.util.ArrayList;

/**
 * Contrôleur du composant functionComboBox.fxml
 */
public class FunctionComboBoxController {
    /**
     * Liste des instances : garde un accès pour mettre à jour chque instance
     */
    private static ArrayList<FunctionComboBoxController> instanceList = new ArrayList<>();
    /**
     * Constructeur de la classe : ajoute l'instance à la liste
     */
    public FunctionComboBoxController() {
        instanceList.add(this);
    }
    /**
     * Met à jour pour chaque instance la liste des fonctions dans la comboBox
     */
    public static void updateList() {
        for (FunctionComboBoxController instance : instanceList) {
            Object selection = instance.comboBox.getValue();
            instance.comboBox.getItems().clear();
            instance.comboBox.getItems().addAll(ExpressManager.getExpressNames());
            instance.comboBox.setValue(selection);
        }
    }


    /**
     * Element du fxml : choix de la fonction ou écriture libre
     */
    @FXML
    private ComboBox comboBox;
    /**
     * Getter sécurisé du texte inscrit dans la comboBox
     * @return
     */
    public String getValue() {
        return (comboBox.getValue() instanceof String) ? comboBox.getValue().toString() : "0";
    }
    /**
     * Getter sécurisé de la fonction sélectionnée ou écrite dans la comboBox
     * @return
     */
    public String getFunction() {
        if (comboBox.getValue() instanceof String) {
            String userChoice = ExpressManager.replaceExpressNameByFunctionRecursively(comboBox.getValue().toString());
            return ExpressManager.containsExpress(userChoice) ? ExpressManager.getExpress(userChoice).getFunction() : userChoice;
        }
        else return "0";
    }
}
