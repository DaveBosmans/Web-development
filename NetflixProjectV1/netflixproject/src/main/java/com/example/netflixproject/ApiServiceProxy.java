package com.example.netflixproject;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ApiService")
public interface ApiServiceProxy extends ApiService{


}
