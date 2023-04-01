package com.pokemonapi.entry;

import com.fasterxml.jackson.databind.JsonNode;

public class Entry {

    JsonNode results;

    public Entry(JsonNode results){
        this.results = results;
    }

    public JsonNode getResults() {
        return results;
    }

    public void setResults(JsonNode results) {
        this.results = results;
    }
}
