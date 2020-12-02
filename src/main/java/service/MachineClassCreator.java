package service;

import model.MachineClass;

public class MachineClassCreator {

    public static final String MACHINE_CLASS = "0";

    /**
     * Machine Class
     * 0 - Regular
     * 1 - Preemptible
     */

    public static MachineClass withCredentialsFromProperty() {
        return new MachineClass(MACHINE_CLASS);
    }
}