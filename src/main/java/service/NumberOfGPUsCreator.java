package service;

import model.NumberOfGPUs;

public class NumberOfGPUsCreator {

    public static final String NUMBER_OF_GPU = "gpu.number";

    /**
     * Number of GPUs
     * 0 - 0
     * 1 - 1
     * 2 - 2
     * 3 - 4
     * 4 - 8
     */

    public static NumberOfGPUs withCredentialsFromProperty() {
        return new NumberOfGPUs(TestDataReader.getTestData(NUMBER_OF_GPU));
    }
}