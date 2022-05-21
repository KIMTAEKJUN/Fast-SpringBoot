package com.example.put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

public class PostRequestDto {
    private String name;
    private String age;

    @JsonProperty("car_list")
    private List<CarDto> carlist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<CarDto> getCarlist() {
        return carlist;
    }

    public void setCarlist(List<CarDto> carlist) {
        this.carlist = carlist;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", carlist=" + carlist +
                '}';
    }
}
