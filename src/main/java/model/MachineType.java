package model;

public class MachineType {

    private String machineType;

    public MachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineType{");
        sb.append("machineType='").append(machineType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}