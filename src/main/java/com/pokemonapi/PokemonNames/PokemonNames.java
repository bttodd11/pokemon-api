package com.pokemonapi.PokemonNames;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class PokemonNames {
    private int id;
    private ObjectNode name;

    public PokemonNames(int id, ObjectNode name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public ObjectNode getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PokemonNames{" +
                "id=" + id +
                ", name='" + name + '\'' + '}';
    }

    public void setName(ObjectNode name) {
        this.name = name;
    }

}
