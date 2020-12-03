package model;

public class CommittedUsage {

    private String committedUsage;

    public CommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommittedUsage{");
        sb.append("committedUsage='").append(committedUsage).append('\'');
        sb.append('}');
        return sb.toString();
    }
}