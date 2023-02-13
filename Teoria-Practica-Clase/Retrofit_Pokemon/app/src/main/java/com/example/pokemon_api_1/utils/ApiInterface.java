package com.example.pokemon_api_1.utils;

import com.example.pokemon_api_1.entities.Pokemon;
import com.example.pokemon_api_1.entities.PokemonRespuesta;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("pokemon")
    Call<ArrayList<Pokemon>> getPokemons();
    /*https://pokeapi.co/api/v2/pokemon?limit=20&offset=20 */
    @GET("pokemon")
    Call<PokemonRespuesta<Pokemon>> getPokemons(@Query("Limit") int limit,@Query("offset")int offset);
    //Call<ArrayList<Pokemon>> getPopularSimpson(@Query("count")

    //Call<ArrayList<Simpson>>  getPopularSimpson(@Path("count") int count);
/*
    @GET("movie/{movie_id}")
    Call<Movie> getMovieDetails(@Path("movie_id") int movieId,
                @Query("api_key") String apiKey, @Query("append_to_response") String credits);
*/
}
