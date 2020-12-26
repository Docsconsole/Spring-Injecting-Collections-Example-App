package com.docsconsole.tutorials.injection.beanref;


import lombok.Getter;

@Getter
public class ASpringBean {

    private String beanName;

    public ASpringBean(String beanName) {
        this.beanName = beanName;
    }

    public ASpringBean() {
    }


}
