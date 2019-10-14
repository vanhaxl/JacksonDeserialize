package com.example.jacksondeserialize.controller;

import com.example.jacksondeserialize.model.Animal;
import com.example.jacksondeserialize.model.AnimalManagement;
import com.example.jacksondeserialize.model.Cat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @RequestMapping("/ping")
    public String hello() {
        return "pong";
    }

    @RequestMapping(value = "/test", method =  RequestMethod.POST)
    public List<Animal> test(@RequestBody AnimalManagement animalManagement){

        for(Animal animal: animalManagement.getAnimalList()){
            if(animal instanceof Cat){
                System.out.println(animal.getId()  + " is a Cat");
            }
        }
        return animalManagement.getAnimalList();

    }

}
