package model;

public class NumberOfGPUs {

    private int numberOfGPUsValue;

    public NumberOfGPUs() {
    }

    public int getNumberOfGPUsValue() {
        return numberOfGPUsValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberOfGPUs{");
        sb.append("numberOfGPUsValue='").append(numberOfGPUsValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}