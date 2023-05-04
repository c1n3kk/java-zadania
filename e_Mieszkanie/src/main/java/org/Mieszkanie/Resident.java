package org.Mieszkanie;

public class Resident {
    public String name;
    public boolean isOwner;

    public Resident(String name, boolean isOwner) {
        this.name = name;
        this.isOwner = isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }
}