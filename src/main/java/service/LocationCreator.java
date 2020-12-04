package service;

import model.Location;

public class LocationCreator {

    public static final String LOCATION = "location";

    public static Location withCredentialsFromProperty() {
        return new Location(TestDataReader.getTestData(LOCATION));
    }
}