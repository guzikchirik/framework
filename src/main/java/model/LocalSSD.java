package model;

public class LocalSSD {

    private int localSSDValue;

    public LocalSSD() {
    }

    public int getLocalSSDValue() {
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