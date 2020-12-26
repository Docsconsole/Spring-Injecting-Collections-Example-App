package com.docsconsole.tutorials.injection.list;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Movies {

    @Autowired
    private List<String> nameList;

    public Movies() {
    }

    public void getNameList() {
        System.out.println(nameList);
    }
}
