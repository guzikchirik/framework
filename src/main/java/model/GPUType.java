package model;

public class GPUType {

    private int gpuTypeValue;

    public GPUType() {
    }

    public int getGpuTypeValue() {
        return gpuTypeValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GPUType{");
        sb.append("gpuTypeValue='").append(gpuTypeValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}