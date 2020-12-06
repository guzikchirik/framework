package service;

import java.util.ResourceBundle;

public class FormModelCreator {

    private final ResourceBundle RES_BUNDLE = ResourceBundle.getBundle(System.getProperty("environment"));

    private final String FORM = "form";

    private final String PATH_TO_JSON_FILE = "src/test/resources/dataForTests/parametersForSearch.json";

    private final JsonReader JSON_READER = new JsonReader();

    public String getDataFromProps() {
        return RES_BUNDLE.getString(FORM);
    }

    public String readSearchValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getSearch().getSearchValue();
    }

    public String readOperatingSystemValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getOperatingSystem().getOperatingSystemValue();
    }

    public String readMachineClassValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getMachineClass().getMachineClassValue();
    }

    public String readSeriesValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getSeries().getSeriesValue();
    }

    public String readMachineTypeValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getMachineType().getMachineTypeValue();
    }

    public String readNumberOfGPUsValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getNumberOfGPUs().getNumberOfGPUsValue();
    }

    public String readGPUTypeValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getGpuType().getGpuTypeValue();
    }

    public String readLocalSSDValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getLocalSSD().getLocalSSDValue();
    }

    public String readLocationValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getLocation().getLocationValue();
    }

    public String readCommittedUsageValue() {
        return JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProps())).getCommittedUsage().getCommittedUsageValue();
    }
}