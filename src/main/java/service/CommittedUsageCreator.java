package service;

import model.CommittedUsage;

public class CommittedUsageCreator {

    public static final String COMMITTED_USAGE = "committed.usage";

    public static CommittedUsage withCredentialsFromProperty() {
        return new CommittedUsage(TestDataReader.getTestData(COMMITTED_USAGE));
    }
}