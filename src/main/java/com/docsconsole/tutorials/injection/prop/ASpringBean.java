package com.docsconsole.tutorials.injection.prop;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class ASpringBean {

    @Value("${test.property.value}")
    private String testProperty;

    public ASpringBean() {
    }


}
