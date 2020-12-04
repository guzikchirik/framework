package service;

import model.Location;

public class LocationCreator {

    public static final String LOCATION = "location";

    /**
     *      Datacenter location
     * 0 - Iowa (us-central1)
     * 1 - South Carolina (us-east1)
     * 2 - Northern Virginia (us-east4)
     * 3 - Oregon (us-west1)
     * 4 - Los Angeles (us-west2)
     * 5 - Salt Lake City (us-west3)
     * 6 - Las Vegas (us-west4)
     * 7 - Belgium (europe-west1)
     * 8 - London (europe-west2)
     * 9 - Frankfurt (europe-west3)
     * 10 - Taiwan (asia-east1)
     * 11 - Hong Kong (asia-east2)
     * 12 - Tokyo (asia-northeast1)
     * 13 - Osaka (asia-northeast2)
     * 14 - Seoul (asia-northeast3)
     * 15 - Singapore (asia-southeast1)
     * 16 - Jakarta (asia-southeast2)
     * 17 - Mumbai (asia-south1)
     * 18 - Sydney (australia-southeast1)
     * 19 - Sao Paulo (southamerica-east1)
     * 20 - Netherlands (europe-west4)
     * 21 - Zurich (europe-west6)
     * 22 - Finland (europe-north1)
     * 23 - Montréal, Canada (northamerica-northeast1)
     */

    public static Location withCredentialsFromProperty() {
        return new Location(TestDataReader.getTestData(LOCATION));
    }
}