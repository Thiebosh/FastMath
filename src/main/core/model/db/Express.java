package core.model.db;

import javafx.beans.property.*;

public class Express {
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty function = new SimpleStringProperty();

    private final BooleanProperty isActive = new SimpleBooleanProperty();
    private final IntegerProperty sampling = new SimpleIntegerProperty();//nbPoints

    public Express() {
    }

    public Express(String name, String function) {
        this.name.set(name);
        this.function.set(function);
    }

    public Express(String name, String function, int sampling, boolean isActive) {
        this.name.set(name);
        this.function.set(function);
        this.sampling.set(sampling);
        this.isActive.set(isActive);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setFunction(String function) {
        this.function.set(function);
    }

    public String getName() {
        return name.get();
    }

    public String getFunction() {
        return function.get();
    }


    public StringProperty nameProperty() {
        return name;
    }


    public StringProperty functionProperty() {
        return function;
    }


    public boolean isActive() {
        return isActive.get();
    }

    public BooleanProperty isActiveProperty() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive.set(isActive);
    }

    public int getSampling() {
        return sampling.get();
    }

    public IntegerProperty samplingProperty() {
        return sampling;
    }

    public void setSampling(int sampling) {
        this.sampling.set(sampling);
    }
}
