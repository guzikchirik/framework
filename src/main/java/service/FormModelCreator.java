package service;

import model.FormModel;
import org.openqa.selenium.Keys;
import java.util.List;

public class FormModelCreator {

    private final String form = "form";
    private final String readerType = "json.reader";
    private final PropsReader propsReader = new PropsReader();
    private final int formNumber = Integer.parseInt(propsReader.getDataFromProperties(form));
    private final String pathToJsonFile = "src/test/resources/dataForTests/parametersForSearch.json";
    private final List<FormModel> formsList = ReaderManager.initReader(propsReader.getDataFromProperties(readerType))
            .getFormModelsFromJsonFile(pathToJsonFile);

    public String readSearchValue() {
        return formsList.get(formNumber).getSearch().getSearchValue();
    }

    public Keys readInstancesNumberValue() {
        Keys keys;
        switch (formsList.get(formNumber).getInstancesNumber().getInstancesNumberValue()) {
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
                throw new IllegalStateException("Unexpected value: " + formsList
                        .get(formNumber).getInstancesNumber().getInstancesNumberValue());
        }
        return keys;
    }

    public int readOperatingSystemValue() {
        return formsList.get(formNumber).getOperatingSystem().getOperatingSystemValue();
    }

    public int readMachineClassValue() {
        return formsList.get(formNumber).getMachineClass().getMachineClassValue();
    }

    public int readSeriesValue() {
        return formsList.get(formNumber).getSeries().getSeriesValue();
    }

    public int readMachineTypeValue() {
        return formsList.get(formNumber).getMachineType().getMachineTypeValue();
    }

    public int readNumberOfGPUsValue() {
        return formsList.get(formNumber).getNumberOfGPUs().getNumberOfGPUsValue();
    }

    public int readGPUTypeValue() {
        return formsList.get(formNumber).getGpuType().getGpuTypeValue();
    }

    public int readLocalSSDValue() {
        return formsList.get(formNumber).getLocalSSD().getLocalSSDValue();
    }

    public int readLocationValue() {
        return formsList.get(formNumber).getLocation().getLocationValue();
    }

    public int readCommittedUsageValue() {
        return formsList.get(formNumber).getCommittedUsage().getCommittedUsageValue();
    }
}