package com.kaishengit.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("MOVIE-SERVICE-PROVIDER")
public interface MoviceServiceClient {

    @GetMapping("/movie/{id}")
    String getMovieName(@PathVariable(name = "id") Integer id);

    @PostMapping("/movie/new")
    String saveNewMovie(@RequestParam(name = "movieName") String movieName,
                        @RequestParam(name = "author") String author);
}
