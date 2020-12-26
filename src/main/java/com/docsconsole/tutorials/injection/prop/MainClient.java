package com.docsconsole.tutorials.injection.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ASpringBean ASpringBean = context.getBean(com.docsconsole.tutorials.injection.prop.ASpringBean.class);
        System.out.println(ASpringBean.getTestProperty());

    }
}