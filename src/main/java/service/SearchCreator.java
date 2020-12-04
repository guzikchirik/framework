package service;

import model.Search;

public class SearchCreator {

    public static final String SEARCH_TERM = "search.term";

    public static Search withCredentialsFromProperty() {
        return new Search(TestDataReader.getTestData(SEARCH_TERM));
    }
}