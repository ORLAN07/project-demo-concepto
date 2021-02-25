package com.nuvu.project.rest;

import com.nuvu.project.dto.PostDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class ConsumingRest {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRest.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        PostDto postDtoRequest = PostDto.builder()
                .userId(11)
                .id(111)
                .title("test for nuvu")
                .body("body in test request for nuvu").build();
        return args -> {
            List<PostDto> postDto = restTemplate.getForObject(
                    "https://jsonplaceholder.typicode.com/posts", List.class
            );
            PostDto postDtoPost = restTemplate.postForObject(
                    "https://jsonplaceholder.typicode.com/posts", postDtoRequest, PostDto.class
            );
            log.info("the get posts>>" + postDto);
            log.info("the post posts>>" + postDtoPost);
        };
    }

}
