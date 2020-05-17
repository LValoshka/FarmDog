package com.example.entity;

import java.util.List;

public class Aviary {
    private List<Dog> dogList;
    private boolean isDirty;
    private boolean isDogExist;


    public Aviary(List<Dog> dogList, boolean isDirty) {
        this.dogList = dogList;
        this.isDirty = isDirty;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }


    public boolean isDogExist() {
        for (Dog dog : dogList) {
            if (dog.isInAviary()) {
                setDogExist(true);
                break;
            } else {
                setDogExist(false);
            }
        }
        return isDogExist;
    }

    public void setDogExist(boolean dogExist) {
        isDogExist = dogExist;
    }
}
