package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @GetMapping(value = "/coffeelover")
    public String getCoffee() {

        return "I like coffee!";
    }

    @GetMapping(value = "/coffee")
    public String getCoffeeWithoutRequestParams() {

        return {"name":"latte"};

    }




}
