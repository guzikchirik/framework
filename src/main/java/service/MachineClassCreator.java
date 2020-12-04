package service;

import model.MachineClass;

public class MachineClassCreator {

    public static final String MACHINE_CLASS = "machine.class";

    public static MachineClass withCredentialsFromProperty() {
        return new MachineClass(TestDataReader.getTestData(MACHINE_CLASS));
    }
}