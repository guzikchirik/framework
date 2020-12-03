package service;

import model.GPUType;

public class GPUTypeCreator {

    public static final String GPU_TYPE = "3";

    /**
     *          GPU type
     * 0 - NVIDIA Tesla K80
     * 1 - NVIDIA Tesla P100
     * 2 - NVIDIA Tesla P4
     * 3 - NVIDIA Tesla V100
     * 4 - NVIDIA Tesla T4
     */

    public static GPUType withCredentialsFromProperty() {
        return new GPUType(GPU_TYPE);
    }
}