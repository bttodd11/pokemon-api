package com.pokemonapi.restservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamesController {

    @GetMapping("/names")
    public Names names(@RequestParam(value="name", defaultValue = "World") String name) {

        return new Names(name);
    }
}




