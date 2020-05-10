package core.model.services;

import javafx.stage.Stage;

import java.util.HashMap;

public abstract class ContextController<T> {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public abstract void setInitialValues(HashMap<String, Object> args);

    public void closeStage() {
        stage.close();
    }
}
