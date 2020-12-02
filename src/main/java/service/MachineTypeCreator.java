package service;

import model.MachineType;

public class MachineTypeCreator {

    public static final String MACHINE_TYPE = "3";

    /**
     * Machine Family - General purpose
     *          N1 series
     * 0 - n1-standard-1 (vCPUs: 1, RAM: 3.75GB)
     * 1 - n1-standard-2 (vCPUs: 2, RAM: 7.5GB)
     * 2 - n1-standard-4 (vCPUs: 4, RAM: 15GB)
     * 3 - n1-standard-8 (vCPUs: 8, RAM: 30GB)
     * 4 - n1-standard-16 (vCPUs: 16, RAM: 60GB)
     * 5 - n1-standard-32 (vCPUs: 32, RAM: 120GB)
     * 6 - n1-standard-64 (vCPUs: 64, RAM: 240GB)
     * 7 - n1-standard-96 (vCPUs: 96, RAM: 360GB)
     * 8 - n1-highmem-2 (vCPUs: 2, RAM: 13GB)
     * 9 - n1-highmem-4 (vCPUs: 4, RAM: 26GB)
     * 10 - n1-highmem-8 (vCPUs: 8, RAM: 52GB)
     * 11 - n1-highmem-16 (vCPUs: 16, RAM: 104GB)
     * 12 - n1-highmem-32 (vCPUs: 32, RAM: 208GB)
     * 13 - n1-highmem-64 (vCPUs: 64, RAM: 416GB)
     * 14 - n1-highmem-96 (vCPUs: 96, RAM: 624GB)
     * 15 - n1-highcpu-2 (vCPUs: 2, RAM: 1.8GB)
     * 16 - n1-highcpu-4 (vCPUs: 4, RAM: 3.6GB)
     * 17 - n1-highcpu-8 (vCPUs: 8, RAM: 7.2GB)
     * 18 - n1-highcpu-16 (vCPUs: 16, RAM: 14.4GB)
     * 19 - n1-highcpu-32 (vCPUs: 32, RAM: 28.8GB)
     * 20 - n1-highcpu-64 (vCPUs: 64, RAM: 57.6GB)
     * 21 - n1-highcpu-96 (vCPUs: 96, RAM: 86.4GB)
     *
     *          N2 series
     * 0 - n2-standard-2 (vCPUs: 2, RAM: 8GB)
     * 1 - n2-standard-4 (vCPUs: 4, RAM: 16GB)
     * 2 - n2-standard-8 (vCPUs: 8, RAM: 32GB)
     * 3 - n2-standard-16 (vCPUs: 16, RAM: 64GB)
     * 4 - n2-standard-32 (vCPUs: 32, RAM: 128GB)
     * 5 - n2-standard-48 (vCPUs: 48, RAM: 192GB)
     * 6 - n2-standard-64 (vCPUs: 64, RAM: 256GB)
     * 7 - n2-standard-80 (vCPUs: 80, RAM: 320GB)
     * 8 - n2-highmem-2 (vCPUs: 2, RAM: 16GB)
     * 9 - n2-highmem-4 (vCPUs: 4, RAM: 32GB)
     * 10 - n2-highmem-8 (vCPUs: 8, RAM: 64GB)
     * 11 - n2-highmem-16 (vCPUs: 16, RAM: 128GB)
     * 12 - n2-highmem-32 (vCPUs: 32, RAM: 256GB)
     * 13 - n2-highmem-48 (vCPUs: 48, RAM: 384GB)
     * 14 - n2-highmem-64 (vCPUs: 64, RAM: 512GB)
     * 15 - n2-highmem-80 (vCPUs: 80, RAM: 640GB)
     * 16 - n2-highcpu-2 (vCPUs: 2, RAM: 2GB)
     * 17 - n2-highcpu-4 (vCPUs: 4, RAM: 4GB)
     * 18 - n2-highcpu-8 (vCPUs: 8, RAM: 8GB)
     * 19 - n2-highcpu-16 (vCPUs: 16, RAM: 16GB)
     * 20 - n2-highcpu-32 (vCPUs: 32, RAM: 32GB)
     * 21 - n2-highcpu-48 (vCPUs: 48, RAM: 48GB)
     * 22 - n2-highcpu-64 (vCPUs: 64, RAM: 64GB)
     * 23 - n2-highcpu-80 (vCPUs: 80, RAM: 80GB)
     *
     *          E2 series
     * 0 - e2-standard-2 (vCPUs: 2, RAM: 8GB)
     * 1 - e2-standard-4 (vCPUs: 4, RAM: 16GB)
     * 2 - e2-standard-8 (vCPUs: 8, RAM: 32GB)
     * 3 - e2-standard-16 (vCPUs: 16, RAM: 64GB)
     * 4 - e2-standard-32 (vCPUs: 32, RAM: 128GB)
     * 5 - e2-highmem-2 (vCPUs: 2, RAM: 16GB)
     * 6 - e2-highmem-4 (vCPUs: 4, RAM: 32GB)
     * 7 - e2-highmem-8 (vCPUs: 8, RAM: 64GB)
     * 8 - e2-highmem-16 (vCPUs: 16, RAM: 128GB)
     * 9 - e2-highcpu-2 (vCPUs: 2, RAM: 2GB)
     * 10 - e2-highcpu-4 (vCPUs: 4, RAM: 4GB)
     * 11 - e2-highcpu-8 (vCPUs: 8, RAM: 8GB)
     * 12 - e2-highcpu-16 (vCPUs: 16, RAM: 16GB)
     * 13 - e2-highcpu-32 (vCPUs: 32, RAM: 32GB)
     *
     *          N2D series
     * 0 - n2d-standard-2 (vCPUs: 2, RAM: 8GB)
     * 1 - n2d-standard-4 (vCPUs: 4, RAM: 16GB)
     * 2 - n2d-standard-8 (vCPUs: 8, RAM: 32GB)
     * 3 - n2d-standard-16 (vCPUs: 16, RAM: 64GB)
     * 4 - n2d-standard-32 (vCPUs: 32, RAM: 128GB)
     * 5 - n2d-standard-48 (vCPUs: 48, RAM: 192GB)
     * 6 - n2d-standard-64 (vCPUs: 64, RAM: 256GB)
     * 7 - n2d-standard-80 (vCPUs: 80, RAM: 320GB)
     * 8 - n2d-standard-96 (vCPUs: 96, RAM: 384GB)
     * 9 - n2d-standard-128 (vCPUs: 128, RAM: 512GB)
     * 10 - n2d-standard-224 (vCPUs: 224, RAM: 896GB)
     * 11 - n2d-highmem-2 (vCPUs: 2, RAM: 16GB)
     * 12 - n2d-highmem-4 (vCPUs: 4, RAM: 32GB)
     * 13 - n2d-highmem-8 (vCPUs: 8, RAM: 64GB)
     * 14 - n2d-highmem-16 (vCPUs: 16, RAM: 128GB)
     * 15 - n2d-highmem-32 (vCPUs: 32, RAM: 256GB)
     * 16 - n2d-highmem-48 (vCPUs: 48, RAM: 384GB)
     * 17 - n2d-highmem-64 (vCPUs: 64, RAM: 512GB)
     * 18 - n2d-highmem-80 (vCPUs: 80, RAM: 640GB)
     * 19 - n2d-highmem-96 (vCPUs: 96, RAM: 768GB)
     * 20 - n2d-highcpu-2 (vCPUs: 2, RAM: 2GB)
     * 21 - n2d-highcpu-4 (vCPUs: 4, RAM: 4GB)
     * 22 - n2d-highcpu-8 (vCPUs: 8, RAM: 8GB)
     * 23 - n2d-highcpu-16 (vCPUs: 16, RAM: 16GB)
     * 24 - n2d-highcpu-32 (vCPUs: 32, RAM: 32GB)
     * 25 - n2d-highcpu-48 (vCPUs: 48, RAM: 48GB)
     * 26 - n2d-highcpu-64 (vCPUs: 64, RAM: 64GB)
     * 27 - n2d-highcpu-80 (vCPUs: 80, RAM: 80GB)
     * 28 - n2d-highcpu-96 (vCPUs: 96, RAM: 96GB)
     * 29 - n2d-highcpu-128 (vCPUs: 128, RAM: 128GB)
     * 30 - n2d-highcpu-224 (vCPUs: 224, RAM: 224GB)
     *
     * Machine Family - Compute-optimized
     *          C2 series
     * 0 - c2-standard-4 (vCPUs: 4, RAM: 16GB)
     * 1 - c2-standard-8 (vCPUs: 8, RAM: 32GB)
     * 2 - c2-standard-16 (vCPUs: 16, RAM: 64GB)
     * 3 - c2-standard-30 (vCPUs: 30, RAM: 120GB)
     * 4 - c2-standard-60 (vCPUs: 60, RAM: 240GB)
     *
     * Machine Family - Memory-optimized
     *          M1 series
     * 0 - m1-megamem-96 (vCPUs: 96, RAM: 1433.6GB)
     * 1 - m1-ultramem-40 (vCPUs: 40, RAM: 961GB)
     * 2 - m1-ultramem-80 (vCPUs: 80, RAM: 1922GB)
     * 3 - m1-ultramem-160 (vCPUs: 160, RAM: 3844GB)
     *
     *          M2 series
     * 0 - m2-megamem-416 (vCPUs: 416, RAM: 5888GB)
     * 1 - m2-ultramem-208 (vCPUs: 208, RAM: 5888GB)
     * 2 - m2-ultramem-416 (vCPUs: 416, RAM: 11776GB)
     */

    public static MachineType withCredentialsFromProperty() {
        return new MachineType(MACHINE_TYPE);
    }
}