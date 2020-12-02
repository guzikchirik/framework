package model;

public class NumberOfGPUs {

    private String numberOfGPUs;

    public NumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public void setNumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberOfGPUs{");
        sb.append("numberOfGPUs='").append(numberOfGPUs).append('\'');
        sb.append('}');
        return sb.toString();
    }
}