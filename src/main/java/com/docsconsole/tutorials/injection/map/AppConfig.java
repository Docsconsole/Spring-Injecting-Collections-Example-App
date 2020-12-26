/**
 *
 */
package com.docsconsole.tutorials.injection.map;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Movies getMovies() {
        return new Movies();
    }

    @Bean
    public Map<String, String> heroMovieMap() {
        Map heroMovieMap = new HashMap();
        heroMovieMap.put("Robert John Downey", "Iron Man");
        heroMovieMap.put("Tobey Maguire", "Spider Man");
        heroMovieMap.put("Christopher Hemsworth", "Thor");
        return heroMovieMap;
    }
}
