package com.example.entity;

import com.example.utills.DogInterface;

public class Dog implements DogInterface {
    private String nickname;
    private boolean isIll;
    private boolean isHungry;
    private boolean isTrained;
    private boolean isInAviary;
    private int age;
    private Job job;

    public static final int YOUNG_AGE = 1;
    public static final int ADULT_AGE = 8;

    public Dog(String nickname, boolean isIll, boolean isHungry, boolean isTrained, boolean isInAviary, int age, Job job) {
        this.nickname = nickname;
        this.isIll = isIll;
        this.isHungry = isHungry;
        this.isTrained = isTrained;
        this.isInAviary = isInAviary;
        this.age = age;
        this.job = job;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public boolean isInAviary() {
        return isInAviary;
    }

    public void setInAviary(boolean inAviary) {
        isInAviary = inAviary;
    }

    public int getAge() {
        return age;
    }


    public Job getJob() {
        return job;
    }

    @Override
    public void eat(Diet diet) {
        System.out.println("Dog " + getNickname() + " is eating " + diet.name().toLowerCase());
        this.setHungry(false);
    }

    @Override
    public void train() {
        setTrained(true);
    }

    @Override
    public void work() {
        System.out.println("Dog " + getNickname() + " works on " + getJob().name().toLowerCase());
    }
}
