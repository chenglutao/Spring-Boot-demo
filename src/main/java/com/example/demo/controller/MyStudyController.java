package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clt
 * @date 2019-11-29 17:16
 * @package com.example.demo.controller
 */
@RestController
public class MyStudyController {

    @GetMapping("demo")
    public String demo(){
        String str = "spring boot demo";
        return str;
    }

}
