package service;

import java.util.ResourceBundle;

public class PropsReader {

    private final ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public String getDataFromProperties(String key) {
        return resourceBundle.getString(key);
    }
}