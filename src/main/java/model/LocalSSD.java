package model;

public class LocalSSD {

    private String localSSD;

    public LocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocalSSD{");
        sb.append("localSSD='").append(localSSD).append('\'');
        sb.append('}');
        return sb.toString();
    }
}