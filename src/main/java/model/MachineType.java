package model;

public class MachineType {

    private int machineTypeValue;

    public MachineType() {
    }

    public int getMachineTypeValue() {
        return machineTypeValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineType{");
        sb.append("machineTypeValue='").append(machineTypeValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}