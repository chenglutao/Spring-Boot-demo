package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clt
 */
@RestController
public class MyStudyController {

    @GetMapping("demo")
    public String demo(){
        String str = "spring boot demo";
        return str;
    }

}
