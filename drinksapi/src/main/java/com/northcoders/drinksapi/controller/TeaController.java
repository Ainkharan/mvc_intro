package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

    @GetMapping("/tea")
    public Tea getTea(@RequestParam(value = "name", defaultValue = "NCTea") String name,
                      @RequestParam(value = "type", defaultValue = "NCTea") String type,
                      @RequestParam(value = "origin", defaultValue = "NCTea") String origin) {

        return new Tea(name, type, origin);

    }

}
