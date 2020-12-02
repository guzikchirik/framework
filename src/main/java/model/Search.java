package model;

public class Search {

    private String search;

    public Search(String search) {
        this.search = search;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Search{");
        sb.append("search='").append(search).append('\'');
        sb.append('}');
        return sb.toString();
    }
}