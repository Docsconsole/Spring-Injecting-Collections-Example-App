package com.docsconsole.tutorials.injection.list;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Movies {

    @Autowired
    private List<String> movieList;

    public Movies() {}

    public void getMovieList() {
        System.out.println(movieList);
    }
}
