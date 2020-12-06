package model;

public class CommittedUsage {

    private String committedUsageValue;

    public CommittedUsage() {
    }

    public String getCommittedUsageValue() {
        return committedUsageValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommittedUsage{");
        sb.append("committedUsageValue='").append(committedUsageValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}