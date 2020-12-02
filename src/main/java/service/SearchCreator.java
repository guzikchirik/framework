package service;

import model.Search;

public class SearchCreator {

    public static final String SEARCH_TERM = "Google Cloud Platform Pricing Calculator";

    public static Search withCredentialsFromProperty() {
        return new Search(SEARCH_TERM);
    }
}