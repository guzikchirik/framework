package service;

import model.LocalSSD;

public class LocalSSDCreator {

    public static final String LOCAL_SSD = "2";

    /**
     * Local SSD
     * 0 - 0
     * 1 - 1x375 GB
     * 2 - 2x375 GB
     * 3 - 3x375 GB
     * 4 - 4x375 GB
     * 5 - 5x375 GB
     * 6 - 6x375 GB
     * 7 - 7x375 GB
     * 8 - 8x375 GB
     * 9 - 16x375 GB
     * 10 - 24x375 GB
     */

    public static LocalSSD withCredentialsFromProperty() {
        return new LocalSSD(LOCAL_SSD);
    }
}