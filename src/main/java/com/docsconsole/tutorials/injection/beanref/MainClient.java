package com.docsconsole.tutorials.injection.beanref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = context.getBean(Movie.class);
        System.out.println(movie.getMovieName());
        List<Actor> actorList = movie.getActorList();
        for(Actor actor: actorList){
            System.out.println(actor.getActorName());
        }

    }
}
