package model;

import org.openqa.selenium.Keys;

public class InstancesNumber {

    private Keys keys;

    public InstancesNumber(Keys keys) {
        this.keys = keys;
    }

    public Keys getKeys() {
        return keys;
    }

    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstancesNumber{");
        sb.append("keys=").append(keys);
        sb.append('}');
        return sb.toString();
    }
}