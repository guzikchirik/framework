package service;

import com.google.gson.Gson;
import model.FormModel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class GsonReader {

    public List<FormModel> getFormModelsFromJsonFile(String source) {
        Gson gson = new Gson();
        List<FormModel> formModelList = null;
        try {
            formModelList = Arrays.asList(gson.fromJson(new FileReader(source), FormModel[].class));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return formModelList;
    }
}