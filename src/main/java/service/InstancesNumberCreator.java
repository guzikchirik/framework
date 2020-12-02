package service;

import model.InstancesNumber;
import org.openqa.selenium.Keys;

public class InstancesNumberCreator {

    public static final Keys NUMBER_OF_INSTANCES = Keys.NUMPAD4;

    public static InstancesNumber withCredentialsFromProperty() {
        return new InstancesNumber(NUMBER_OF_INSTANCES);
    }
}