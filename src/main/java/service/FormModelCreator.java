package service;

import java.util.ResourceBundle;

public class FormModelCreator {

    private final ResourceBundle RES_BUNDLE = ResourceBundle.getBundle(System.getProperty("environment"));

    private final String FORM = "form";

    private final String PATH_TO_JSON_FILE = "src/test/resources/dataForTests/parametersForSearch.json";

    private final JsonReader JSON_READER = new JsonReader();

    public String getDataFromProperties() {
        return RES_BUNDLE.getString(FORM);
    }

    public String readSearchValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getSearch().getSearchValue();
    }

    public int readOperatingSystemValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getOperatingSystem().getOperatingSystemValue();
    }

    public int readMachineClassValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getMachineClass().getMachineClassValue();
    }

    public int readSeriesValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getSeries().getSeriesValue();
    }

    public int readMachineTypeValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getMachineType().getMachineTypeValue();
    }

    public int readNumberOfGPUsValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getNumberOfGPUs().getNumberOfGPUsValue();
    }

    public int readGPUTypeValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getGpuType().getGpuTypeValue();
    }

    public int readLocalSSDValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getLocalSSD().getLocalSSDValue();
    }

    public int readLocationValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getLocation().getLocationValue();
    }

    public int readCommittedUsageValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getCommittedUsage().getCommittedUsageValue();
    }
}