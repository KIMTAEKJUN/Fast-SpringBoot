package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

public class User {
    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    @Valid
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }

    // @AssertTrue(message = "yyyyMM 의 형식에 맞지 않습니다.")
    // public boolean isReqYearMonthValidation() {
    //    System.out.println("Assert true call");
    //    try {
    //        LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
    //    } catch (Exception e) {
    //        return false;
    //    }
    //    return true;
    // }
}
