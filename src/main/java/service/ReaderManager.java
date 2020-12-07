package service;

import model.FormModel;
import java.util.List;

public interface ReaderManager {

    List<FormModel> getFormModelsFromJsonFile(String source);

    static ReaderManager initReader(String key) {
        ReaderManager readerManager;
        switch (key) {
            case "jackson" : {
                readerManager = new JsonReader();
                break;
            }
            case "gson" : {
                readerManager = new GsonReader();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value in properties file: " + key);
        }
        return readerManager;
    }
}