package model;

public class Search {

    private String searchValue;

    public Search() {
    }

    public String getSearchValue() {
        return searchValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Search{");
        sb.append("searchValue='").append(searchValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}