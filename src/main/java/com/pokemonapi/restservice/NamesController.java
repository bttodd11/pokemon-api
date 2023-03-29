package com.pokemonapi.restservice;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.pokemonapi.PokemonNames.PokemonNames;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class NamesController {

    // WHen I hit this URL I want more than just the names, I want them already filtered
    // out
    @GetMapping("/names")
    public List<Object> getNames() {

        String url = "https://pokeapi.co/api/v1/pokemon?limit=1279";
        RestTemplate restTemplate = new RestTemplate();

        Object names = restTemplate.getForObject(url, Object.class);


    return Arrays.asList(names);
    }


}




