package model;

public class Series {

    private int seriesValue;

    public Series() {
    }

    public int getSeriesValue() {
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