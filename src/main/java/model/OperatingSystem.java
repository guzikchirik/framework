package model;

public class OperatingSystem {

    private int operatingSystemValue;

    public OperatingSystem() {
    }

    public int getOperatingSystemValue() {
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