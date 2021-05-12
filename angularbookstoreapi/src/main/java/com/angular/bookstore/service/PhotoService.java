package com.angular.bookstore.service;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.angular.bookstore.model.Photo;

import reactor.core.publisher.Mono;

@Service
public class PhotoService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<List> getPhoto()
    {
    	Mono<List> product = (Mono<List>) webClientBuilder.build()
    			.get()
                .uri("https://jsonplaceholder.typicode.com/photos")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List>() {});
		return product;
    }

}
