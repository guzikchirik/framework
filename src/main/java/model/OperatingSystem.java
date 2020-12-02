package model;

public class OperatingSystem {

    private String operatingSystem;

    public OperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OperatingSystem{");
        sb.append("operatingSystem='").append(operatingSystem).append('\'');
        sb.append('}');
        return sb.toString();
    }
}