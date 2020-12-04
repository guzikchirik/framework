package service;

import model.NumberOfGPUs;

public class NumberOfGPUsCreator {

    public static final String NUMBER_OF_GPU = "gpu.number";

    public static NumberOfGPUs withCredentialsFromProperty() {
        return new NumberOfGPUs(TestDataReader.getTestData(NUMBER_OF_GPU));
    }
}