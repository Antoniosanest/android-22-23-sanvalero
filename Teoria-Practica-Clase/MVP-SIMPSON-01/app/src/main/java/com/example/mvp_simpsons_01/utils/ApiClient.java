package com.example.mvp_simpsons_01.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL =
            "http://172.21.3.34:8080/RakutenTV/webresources/";

    public static final String BASE_URL1 =
            "https://thesimpsonsquoteapi.glitch.me/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL1)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
