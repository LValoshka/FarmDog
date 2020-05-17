package com.example.entity;

import com.example.utills.VeterinarianInterface;

public class Veterinarian implements VeterinarianInterface {

    @Override
    public void inspect(Dog dog) {
        if (dog.isIll()) {
            System.out.println("\tDog " + dog.getNickname() + " is ill.\n Veterinarian need to pick him up for treatment.");
            treat(dog);
        } else {
            System.out.println("\tDog " + dog.getNickname() + " is healthy.");
        }
    }

    @Override
    public void treat(Dog dog) {
        dog.setIll(false);
        System.out.println("\t" + dog.getNickname() + " recovered!");
    }
}
