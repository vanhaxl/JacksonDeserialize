package com.example.jacksondeserialize.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;
import java.util.List;


public class AnimalManagement {

    private List<Animal> animalList;

    public List<Animal> getAnimalList() {
        return animalList;
    }
    @JsonSetter
    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public AnimalManagement(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public AnimalManagement(){
        this.animalList = new ArrayList<>();
    }
}
