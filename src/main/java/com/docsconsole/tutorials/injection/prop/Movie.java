package com.docsconsole.tutorials.injection.prop;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class Movie {

    @Value("${test.movie.name}")
    private String movieName;

    public Movie() {
    }


}
