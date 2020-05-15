package com.example.entity;

import com.example.utills.StaffInterface;

public class Staff implements StaffInterface {

    @Override
    public void feed(Dog dog) {
        if (dog.isHungry()) {
            if (dog.getAge() <= Dog.YOUNG_AGE) {
                dog.eat(Diet.DIET_FOR_PUPPY);
            } else if (dog.getAge() > Dog.YOUNG_AGE && dog.getAge() <= Dog.ADULT_AGE) {
                dog.eat(Diet.DIET_FOR_ADULT_DOG);
            } else {
                dog.eat(Diet.DIET_FOR_ELDERLY_DOG);
            }
        } else {
            System.out.println("Dog " + dog.getNickname() + " isn't hungry.");
        }
    }

    @Override
    public void cleanAviary(Aviary aviary) {
        if (aviary.isDirty()) {
            aviary.setDirty(false);
            System.out.println("The aviary is cleaned.");
        } else {
            System.out.println("The aviary is already clean");
        }
    }

    @Override
    public void dayRoutine(Dog dog, TrainingGround trainingGround) {
        if (dog.getAge() <= Dog.YOUNG_AGE) {
            cleanTrainingGround(trainingGround);
            dog.train();
            System.out.println("Dog " + dog.getNickname() + " is training now.");
        } else if (dog.getAge() > Dog.YOUNG_AGE && dog.getAge() <= Dog.ADULT_AGE) {
            System.out.println("Dog " + dog.getNickname() + " is assigned to work.");
            dog.work();
        } else {
            System.out.println("Dog " + dog.getNickname() + " is getting to the aviary.");
            dog.setInAviary(true);
        }
    }

    @Override
    public void freeAviary(Aviary aviary) {
        if (aviary.isDogExist()) {
            for (Dog dog : aviary.getDogList()) {
                dog.setInAviary(false);
            }
            System.out.println("Dogs are outside.");
        } else {
            System.out.println("Aviary is already free.");
        }
    }

    @Override
    public void cleanTrainingGround(TrainingGround trainingGround) {
        if (trainingGround.isDirty()) {
            System.out.println("Training ground is dirty. Wait for the worker to clean it");
            trainingGround.setDirty(false);
            System.out.println("Training ground is clean. Now you can train");
        } else {
            System.out.println("Training ground is clean. You can train");
        }
    }
}
