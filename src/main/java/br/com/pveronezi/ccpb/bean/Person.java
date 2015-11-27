package br.com.pveronezi.ccpb.bean;

/**
 * Created by pveronezi on 19/11/15.
 */

import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private String id;

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}