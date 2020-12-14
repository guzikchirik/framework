package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.FormModel;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonReader implements ReaderManager {

    @Override
    public List<FormModel> getFormModelsFromJsonFile(String source) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<FormModel> formModelList = null;
        try {
            formModelList = Arrays.asList(objectMapper.readValue(new File(source), FormModel[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return formModelList;
    }

    @Override
    public ReaderManager initReader(String key) {
        return null;
    }
}