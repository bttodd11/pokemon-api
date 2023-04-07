package com.pokemonapi.utils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokemonapi.deserializer.entry.Entry;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class fetchUtils {

    String url = "https://pokeapi.co/api/v1/";


    public List<Object> getNames(){

    RestTemplate restTemplate = new RestTemplate();
    Object names = restTemplate.getForObject(url + "pokemon?1249", Object.class);
    stripJson(names);
    return Arrays.asList(names);
    }

    public List<Object> getNames(){

        RestTemplate restTemplate = new RestTemplate();
        Object names = restTemplate.getForObject(url + "pokemon?1249", Object.class);
        stripJson(names);
        return Arrays.asList(names);
    }

    // Next method needs to parse the Array we are getting back
    public static void stripJson(Object data){
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.valueToTree(data);
        JsonNode jsonNode = node.path("results");
        ArrayList<String> nameList = new ArrayList<String>();
        Entry entryName = new Entry();


        if(jsonNode.isArray()){
            for(JsonNode jsonNodeNames : jsonNode){
                String names = jsonNodeNames.get("name").asText();
                nameList.add(names);
            }
        }

        entryName.setResults(nameList);
//        entryName.set
    }
}
