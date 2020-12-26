package com.docsconsole.tutorials.injection.list;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Movies getMovies() {
        return new Movies();
    }

    @Bean
    public List<String> movieList() {
        return Arrays.asList("Iron Man", "Spider Man", "Thor");
    }
}
