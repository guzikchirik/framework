package service;

import model.MachineType;

public class MachineTypeCreator {

    public static final String MACHINE_TYPE = "machine.type";

    public static MachineType withCredentialsFromProperty() {
        return new MachineType(TestDataReader.getTestData(MACHINE_TYPE));
    }
}