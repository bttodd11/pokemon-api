package com.pokemonapi.utils;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pokemonapi.entry.Entry;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

public class fetchUtils {


    public List<Object> getNames(String url){

    RestTemplate restTemplate = new RestTemplate();
    Object names = restTemplate.getForObject(url, Object.class);

    stripJson(names);
    return Arrays.asList(names);

    }

    // Next method needs to parse the Array we are getting back
    public static void stripJson(Object data){

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.valueToTree(data);
        JsonNode jsonNode = node.path("results");




    }
}
