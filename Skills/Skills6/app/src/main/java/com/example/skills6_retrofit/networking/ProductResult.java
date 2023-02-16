package com.example.skills6_retrofit.networking;



public class ProductResult {
    @SerializedName("id")
    int id;

    @SerializedName("title")
    String title;

    @SerializedName("image")
    String productImage;

    public String getProductImage() {
        return productImage;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
