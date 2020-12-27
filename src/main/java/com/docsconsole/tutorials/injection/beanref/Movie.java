package com.docsconsole.tutorials.injection.beanref;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
public class Movie {

    @Autowired
    private List<Actor> actorList;

    private String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public Movie() {}

    public List getActorList() {
        return actorList;
    }
}
