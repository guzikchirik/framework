package service;

import model.OperatingSystem;

public class OperatingSystemCreator {

    public static final String OPERATING_SYSTEM = "operating.system";

    public static OperatingSystem withCredentialsFromProperty() {
        return new OperatingSystem(TestDataReader.getTestData(OPERATING_SYSTEM));
    }
}