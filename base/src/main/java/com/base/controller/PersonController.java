package com.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @GetMapping("/get")
    public String get() {
        return "test";
    }
}
