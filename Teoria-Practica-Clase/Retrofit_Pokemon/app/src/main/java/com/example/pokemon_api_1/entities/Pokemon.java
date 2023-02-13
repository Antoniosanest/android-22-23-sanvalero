package com.example.pokemon_api_1.entities;

import com.google.gson.annotations.SerializedName;

import kotlin.jvm.internal.SerializedIr;

public class Pokemon {
    /*
    * "name": "bulbasaur",
            "url": "https://pokeapi.co/api/v2/pokemon/1/"
     */

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    @Override
    public String toString(){
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
