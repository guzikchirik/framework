package model;

public class Series {

    private String series;

    public Series(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Series{");
        sb.append("series='").append(series).append('\'');
        sb.append('}');
        return sb.toString();
    }
}