package com.example.netflixproject;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "api.themoviedb.org", url = "http://api.themoviedb.org/")
public interface ApiServiceProxy extends ApiService{


}
