package service;

import model.Series;

public class SeriesCreator {

    public static final String SERIES = "0";

    /**
     *          Series
     * Machine Family - General purpose
     * 0 - N1 - with GPU & with local SSD
     * 1 - N2 - without GPU & with local SSD
     * 2 - E2 - without GPU & without local SSD
     * 3 - N2D - without GPU & with local SSD
     *
     * Machine Family - Compute-optimized
     * 0 - C2 - with GPU & with local SSD
     *
     * Machine Family - Memory-optimized
     * 0 - M1 - with GPU & with local SSD
     * 1 - M2 - with GPU & with local SSD
     */

    public static Series withCredentialsFromProperty() {
        return new Series(SERIES);
    }
}