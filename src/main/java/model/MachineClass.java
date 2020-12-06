package model;

public class MachineClass {

    private String machineClassValue;

    public MachineClass() {
    }

    public String getMachineClassValue() {
        return machineClassValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineClass{");
        sb.append("machineClassValue='").append(machineClassValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}