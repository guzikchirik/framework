package service;

import model.NumberOfGPUs;

public class NumberOfGPUsCreator {

    public static final String NUMBER_OF_GPU = "1";

    /**
     * Number of GPUs
     * 0 - 0
     * 1 - 1
     * 2 - 2
     * 3 - 4
     * 4 - 8
     */

    public static NumberOfGPUs withCredentialsFromProperty() {
        return new NumberOfGPUs(NUMBER_OF_GPU);
    }
}