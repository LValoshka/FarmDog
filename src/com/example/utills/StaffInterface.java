package com.example.utills;

import com.example.entity.Aviary;
import com.example.entity.Dog;
import com.example.entity.TrainingGround;

public interface StaffInterface {
    void feed(Dog dog);
    void cleanAviary(Aviary aviary);
    void dayRoutine(Dog dog, TrainingGround trainingGround);
    void freeAviary(Aviary aviary);
    void cleanTrainingGround(TrainingGround trainingGround);
}
