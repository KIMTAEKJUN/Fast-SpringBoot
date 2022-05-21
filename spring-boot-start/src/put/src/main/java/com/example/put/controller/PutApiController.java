package com.example.put.controller;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put/{userId}")
    public PostRequestDto post(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id) {
        System.out.println(id);
        return requestDto;
    }
}
