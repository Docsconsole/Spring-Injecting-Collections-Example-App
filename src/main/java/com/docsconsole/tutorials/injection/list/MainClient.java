package com.docsconsole.tutorials.injection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movies Movies = context.getBean(Movies.class);
        Movies.getMovieList();

    }
}
