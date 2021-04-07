package com.example.netflixproject;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ApiService {

    @GetMapping("/3/discover/movie?api_key=54556045cb2a05c4fcbc1a1494d5294a")
    public List<Object> getMovies();

    @GetMapping("/3/discover/movie?api_key=54556045cb2a05c4fcbc1a1494d5294a&language=en-US&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&primary_release_year=1980")
    public List<Object> getEighties();
}
