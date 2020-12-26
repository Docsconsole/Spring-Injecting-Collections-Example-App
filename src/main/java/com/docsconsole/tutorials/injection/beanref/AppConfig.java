/**
 *
 */
package com.docsconsole.tutorials.injection.beanref;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ASpringBean getASpringBean() {
        return new ASpringBean("aSpringBean");
    }


}
