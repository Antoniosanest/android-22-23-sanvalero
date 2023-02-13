package com.example.pokemon_api_1.entities;

import java.util.ArrayList;

public class PokemonRespuesta<P> {

    private ArrayList<Pokemon> results;

    public ArrayList<Pokemon> getResults(){
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
