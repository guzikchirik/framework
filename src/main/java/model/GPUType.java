package model;

public class GPUType {

    private String gpuType;

    public GPUType(String gpuType) {
        this.gpuType = gpuType;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GPUType{");
        sb.append("gpuType='").append(gpuType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}