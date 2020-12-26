package com.docsconsole.tutorials.injection.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movies Movies = context.getBean(com.docsconsole.tutorials.injection.set.Movies.class);
        Movies.getMovieSet();

    }
}
