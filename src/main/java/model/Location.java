package model;

public class Location {

    private int locationValue;

    public Location() {
    }

    public int getLocationValue() {
        return locationValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("locationValue='").append(locationValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}