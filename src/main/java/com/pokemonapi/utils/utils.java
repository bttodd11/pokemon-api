package com.pokemonapi.utils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokemonapi.deserializer.entry.Entry;

import java.util.ArrayList;

public class utils {

    // Next method needs to parse the Array we are getting back
    public static void stripNameJson(Object data){
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
        System.out.print(nameList);
    }

    public static void searchEvolutionChain(Object data, String name){
       System.out.println(data);
    }

    public static getSinglePokemonData(String name){
        ObjectMapper mapper = new ObjectMapper();

    }
}
