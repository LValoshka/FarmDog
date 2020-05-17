package com.example.entity;


public class TrainingGround {
    private boolean isDirty;

    public TrainingGround(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
}
