package model;

public class Series {

    private String seriesValue;

    public Series() {
    }

    public String getSeriesValue() {
        return seriesValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Series{");
        sb.append("seriesValue='").append(seriesValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}