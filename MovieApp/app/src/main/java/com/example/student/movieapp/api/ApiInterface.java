package com.example.student.movieapp.api;

import com.example.student.movieapp.models.MovieResult;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Student on 7/22/2017.
 */

public interface ApiInterface {
    @GET("/3/movie/550?api_key=169004d2340a2090a9a7cffa8219f7d8")
    Call<MovieResult>getMovies();
}
