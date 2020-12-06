package service;

import org.openqa.selenium.Keys;
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

    public Keys readInstancesNumberValue() {
        Keys keys;
        switch (JSON_READER.getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                .get(Integer.parseInt(getDataFromProperties())).getInstancesNumber().getInstancesNumberValue()) {
            case 0 : {
                keys = Keys.NUMPAD0;
                break;
            }
            case 1 : {
                keys = Keys.NUMPAD1;
                break;
            }
            case 2 : {
                keys = Keys.NUMPAD2;
                break;
            }
            case 3 : {
                keys = Keys.NUMPAD3;
                break;
            }
            case 4 : {
                keys = Keys.NUMPAD4;
                break;
            }
            case 5 : {
                keys = Keys.NUMPAD5;
                break;
            }
            case 6 : {
                keys = Keys.NUMPAD6;
                break;
            }
            case 7 : {
                keys = Keys.NUMPAD7;
                break;
            }
            case 8 : {
                keys = Keys.NUMPAD8;
                break;
            }
            case 9 : {
                keys = Keys.NUMPAD9;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + JSON_READER
                        .getFormModelsFromJsonFile(PATH_TO_JSON_FILE)
                        .get(Integer.parseInt(getDataFromProperties()))
                        .getInstancesNumber().getInstancesNumberValue());
        }
        return keys;
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