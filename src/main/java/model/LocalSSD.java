package model;

public class LocalSSD {

    private String localSSDValue;

    public LocalSSD() {
    }

    public String getLocalSSDValue() {
        return localSSDValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocalSSD{");
        sb.append("localSSDValue='").append(localSSDValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}