package com.example.jacksondeserialize.model;

import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Cat")
public class Cat extends  Animal{

    private static final long serialVersionUID = 7577696307467335256L;

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
