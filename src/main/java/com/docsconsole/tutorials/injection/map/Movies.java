package com.docsconsole.tutorials.injection.map;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class Movies {

    @Autowired
    private Map<String, String> heroMovieMap;

    public Movies() {
    }

    public void getMovieSet() {
        System.out.println(heroMovieMap);
    }
}
