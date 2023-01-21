package com.subcriptly.restapi.controllers;

import com.subcriptly.models.Env;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("env")
@RequestMapping(value = "environment")
public class EnvController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        var env = new Env();
        return String.format("Hello %s! %s", name, env.getTestValue());
    }
}
