package com.docsconsole.tutorials.injection.beanref;


import lombok.Getter;

@Getter
public class Actor {

    private String actorName;

    public Actor(String actorName) {
        this.actorName = actorName;
    }

    public Actor() {
    }


}
