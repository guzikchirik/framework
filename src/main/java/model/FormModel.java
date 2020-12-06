package model;

public class FormModel {

    private Search search;
    private OperatingSystem operatingSystem;
    private MachineClass machineClass;
    private Series series;
    private MachineType machineType;
    private NumberOfGPUs numberOfGPUs;
    private GPUType gpuType;
    private LocalSSD localSSD;
    private Location location;
    private CommittedUsage committedUsage;

    public FormModel() {
    }

    public Search getSearch() {
        return search;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public MachineClass getMachineClass() {
        return machineClass;
    }

    public Series getSeries() {
        return series;
    }

    public MachineType getMachineType() {
        return machineType;
    }

    public NumberOfGPUs getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public GPUType getGpuType() {
        return gpuType;
    }

    public LocalSSD getLocalSSD() {
        return localSSD;
    }

    public Location getLocation() {
        return location;
    }

    public CommittedUsage getCommittedUsage() {
        return committedUsage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FormModel{");
        sb.append("search=").append(search);
        sb.append(", operatingSystem=").append(operatingSystem);
        sb.append(", machineClass=").append(machineClass);
        sb.append(", series=").append(series);
        sb.append(", machineType=").append(machineType);
        sb.append(", numberOfGPUs=").append(numberOfGPUs);
        sb.append(", gpuType=").append(gpuType);
        sb.append(", localSSD=").append(localSSD);
        sb.append(", location=").append(location);
        sb.append(", committedUsage=").append(committedUsage);
        sb.append('}');
        return sb.toString();
    }
}