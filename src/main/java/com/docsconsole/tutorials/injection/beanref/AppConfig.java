/**
 *
 */
package com.docsconsole.tutorials.injection.beanref;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    //@Qualifier("Actor1")
    public Actor getActor1() {
        return new Actor("Hero");
    }

    @Bean
    //@Qualifier("Actor2")
    public Actor getActor2() {
        return new Actor("Heroine");
    }

    @Bean
    public Movie getMovie() {
        return new Movie("Movie");
    }

}
