package service;

import model.FormModel;
import java.util.List;

public interface ReaderManager {

    List<FormModel> getFormModelsFromJsonFile(String source);

    ReaderManager initReader(String key);
}