package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropsReader {

//    private final ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));
//
//    public String getDataFromProperties(String key) {
//        return resourceBundle.getString(key);
//    }

    public static String getProperty(String prop) {
        FileInputStream fis;
        Properties properties = new Properties();

        try {
            fis = new FileInputStream("src/test/resources/form.properties");
            properties.load(fis);

            return properties.getProperty(prop);

        } catch (IOException e) {
            System.err.println("Wrong pass!!!");
        }
        return "";
    }
}