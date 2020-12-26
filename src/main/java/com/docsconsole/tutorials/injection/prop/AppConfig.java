/**
 *
 */
package com.docsconsole.tutorials.injection.prop;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.properties")
public class AppConfig {

    @Bean
    public ASpringBean getASpringBean() {
        return new ASpringBean();
    }


}
