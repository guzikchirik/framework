package model;

public class MachineClass {

    private String machineClass;

    public MachineClass(String machineClass) {
        this.machineClass = machineClass;
    }

    public String getMachineClass() {
        return machineClass;
    }

    public void setMachineClass(String machineClass) {
        this.machineClass = machineClass;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineClass{");
        sb.append("machineClass='").append(machineClass).append('\'');
        sb.append('}');
        return sb.toString();
    }
}