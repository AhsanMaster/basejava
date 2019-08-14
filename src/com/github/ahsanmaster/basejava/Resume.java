package com.github.ahsanmaster.basejava;

/**
 * Initial resume class
 */
public class Resume {

    // Unique identifier
    private String uuid;

    @Override
    public String toString() {
        return uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Resume other = (Resume) obj;
        if (this.uuid != other.uuid)
            return false;
        return true;
    }
}
