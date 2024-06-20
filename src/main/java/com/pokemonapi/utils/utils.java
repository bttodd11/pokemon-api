package com.pokemonapi.utils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokemonapi.deserializer.entry.Entry;
import java.util.HashMap;
import java.util.ArrayList;

public class utils {

    // Next method needs to parse the Array we are getting back
    public static void stripNameAndIdJson(Object data){
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.valueToTree(data);
        JsonNode jsonNode = node.path("results");
        HashMap<String, Integer> nameAndIdList = new HashMap<String, Integer>();
        Entry entryName = new Entry();
        Integer id = 1;

        if(jsonNode.isArray()){
            for(JsonNode jsonNodeNames : jsonNode){
                String name = jsonNodeNames.get("name").asText();
                nameAndIdList.put(name, id);
                id += 1;
            }
        }
        entryName.setResults(nameAndIdList);
    }

    public static void stripUrlForId(Object data){

    }

    public static void searchEvolutionChain(Object data, String name){
       System.out.println(data);
    }

}
