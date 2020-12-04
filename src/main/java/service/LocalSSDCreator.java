package service;

import model.LocalSSD;

public class LocalSSDCreator {

    public static final String LOCAL_SSD = "local.ssd";

    public static LocalSSD withCredentialsFromProperty() {
        return new LocalSSD(TestDataReader.getTestData(LOCAL_SSD));
    }
}