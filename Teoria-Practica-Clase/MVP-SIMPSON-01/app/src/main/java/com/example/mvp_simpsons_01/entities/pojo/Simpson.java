package com.example.mvp_simpsons_01.entities.pojo;

import com.google.gson.annotations.SerializedName;

public class Simpson {
    /*
     "quote": "These are my only friends...grown-up nerds like Gore Vidal. And even he's kissed more boys than I ever will.",
        "character": "Lisa Simpson",
        "image": "https://cdn.glitch.com/3c3ffadc-3406-4440-bb95-d40ec8fcde72%2FLisaSimpson.png?1497567512083",
        "characterDirection": "Right"
     */
    @SerializedName("quote")
    private String quote;

    @SerializedName("character")
    private String character;

    @SerializedName("image")
    private String image;

    @SerializedName("characterDirection")
    private String characterDirection;

}
