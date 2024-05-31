package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CoffeeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/coffeelover")
    public String getCoffee() {
        return "I like coffee!";
    }

    @GetMapping(value = "/coffee")
    public Result result(@RequestParam(value = "name", defaultValue = "latte") String name) {
        return (new Result(counter.incrementAndGet(), name));
    }

}
