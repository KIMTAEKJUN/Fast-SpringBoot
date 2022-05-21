package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String getHello() {
        return "Get Hello!";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get - http://localhost:8080/api/get/hi
    public String hi() {
        return "Hi!";
    }

    // Path Variable를 받는 방

    // http://localhost:8080/api/get/path-variable/{name}
    @GetMapping(path = "/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // Query Parameter를 받는 방법

    // Map 사용
    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=36
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            System.out.println("\n");

            sb.append(key + " = " + value + "\n");
        });
        return sb.toString();
    }

    // RequestParam 사용
    @GetMapping(path = "/query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    // 객체 만들어서 하기
    @GetMapping(path = "/query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }}
