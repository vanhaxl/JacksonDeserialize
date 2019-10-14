package com.example.jacksondeserialize.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "clazz")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cat.class , name = "Cat")
})

public class Animal implements Serializable {

    private static final long serialVersionUID = -226143777015057253L;

    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String clazz = this.getClass().getSimpleName();

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
