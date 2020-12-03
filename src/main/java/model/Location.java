package model;

public class Location {

    private String location;

    public Location(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("location='").append(location).append('\'');
        sb.append('}');
        return sb.toString();
    }
}