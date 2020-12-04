package service;

import model.GPUType;

public class GPUTypeCreator {

    public static final String GPU_TYPE = "gpu.type";

    public static GPUType withCredentialsFromProperty() {
        return new GPUType(TestDataReader.getTestData(GPU_TYPE));
    }
}