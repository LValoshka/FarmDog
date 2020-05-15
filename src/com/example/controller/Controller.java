package com.example.controller;

import com.example.entity.*;

import java.util.LinkedList;
import java.util.List;

public class Controller {

    private Staff staff = new Staff();
    private Veterinarian veterinarian = new Veterinarian();
    private List<Dog> dogList = new LinkedList<>();

    public void run() {
        dogList.add(new Dog("Snap", true, true, true, true, 5, Job.POLICE));
        dogList.add(new Dog("Ronald", true, true, true, true, 3, Job.EMERGENCY));
        dogList.add(new Dog("Frosya", false, true, false, true, 1, Job.NO_JOB));
        dogList.add(new Dog("Ben", false, true, false, true, 1, Job.NO_JOB));
        dogList.add(new Dog("Jack", true, true, true, true, 9, Job.NO_JOB));
        Aviary aviary = new Aviary(dogList, true);
        TrainingGround trainingGround = new TrainingGround(true);

        System.out.println("It's a new day!\n ---Morning");
        dogList.forEach(staff::feed);
        staff.freeAviary(aviary);
        dogList.forEach(veterinarian::inspect);
        staff.cleanAviary(aviary);

        System.out.println("\n---Midday");
        for(Dog dog: dogList){
            staff.dayRoutine(dog, trainingGround);
        }

        for (Dog dog : dogList) {
            dog.setHungry(true);
        }

        for (Dog dog : dogList) {
            dog.setInAviary(true);
        }
        System.out.println("\n---Evening");
        dogList.forEach(staff::feed);

        System.out.println("\n Good night!");
        for (Dog dog : dogList) {
            dog.setHungry(true);
        }
    }
}
