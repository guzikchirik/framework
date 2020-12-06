package model;

public class OperatingSystem {

    private String operatingSystemValue;

    public OperatingSystem() {
    }

    public String getOperatingSystemValue() {
        return operatingSystemValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OperatingSystem{");
        sb.append("operatingSystemValue='").append(operatingSystemValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}