package com.pokemonapi.utils;;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static com.pokemonapi.utils.utils.searchEvolutionChain;
import static com.pokemonapi.utils.utils.stripNameJson;

public class fetchUtils {

    String url = "https://pokeapi.co/api/v2/";
    String singlePokemon = url + "/characteristic/";
    String allNames = url + "pokemon?limit=151&offset=0";
    String evolutionChain = url + "evolution-chain/?limit=78";
    String moves = url + "moves/";
    String gender = url + "gender/";
    String color = url + "pokemon-color";
    String form = url + "pokemon-form";
    String habitat = url + "pokemon-habitat";




    public List<Object> getNames(){

    RestTemplate restTemplate = new RestTemplate();
    Object names = restTemplate.getForObject(allNames, Object.class); 
    stripNameJson(names);
    return Arrays.asList(names);
    }

    public Object getEvolutionChain(String name){
        RestTemplate restTemplate = new RestTemplate();
        Object chain = restTemplate.getForObject(evolutionChain, Object.class);
        System.out.print(chain);
        return chain;
    }

    public Object getSinglePokemonData(String name){
        RestTemplate restTemplate = new RestTemplate();
        Object pokemon = restTemplate.getForObject(singlePokemon + name + "/", Object.class);

    }

}
