package com.docsconsole.tutorials.injection.set;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class Movies {

    @Autowired
    private Set<String> moviesSet;

    public Movies() {
    }

    public void getMovieSet() {
        System.out.println(moviesSet);
    }
}
