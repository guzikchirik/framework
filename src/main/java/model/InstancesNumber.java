package model;

public class InstancesNumber {

    private int instancesNumberValue;

    public InstancesNumber() {
    }

    public int getInstancesNumberValue() {
        return instancesNumberValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstancesNumber{");
        sb.append("instancesNumberValue=").append(instancesNumberValue);
        sb.append('}');
        return sb.toString();
    }
}