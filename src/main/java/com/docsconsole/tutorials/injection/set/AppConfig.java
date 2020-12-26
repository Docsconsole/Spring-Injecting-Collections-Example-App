/**
 *
 */
package com.docsconsole.tutorials.injection.set;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class AppConfig {

    @Bean
    public Movies getMovies() {
        return new Movies();
    }

    @Bean
    public Set<String> moviesSet() {
        Set moviesSet = new HashSet<>();
        moviesSet.add("Iron Man");
        moviesSet.add("Spider Man");
        moviesSet.add("Titanic");
        return moviesSet;
    }
}
