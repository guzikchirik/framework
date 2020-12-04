package service;

import model.Series;

public class SeriesCreator {

    public static final String SERIES = "series";

    public static Series withCredentialsFromProperty() {
        return new Series(TestDataReader.getTestData(SERIES));
    }
}