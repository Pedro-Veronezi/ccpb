package br.com.pveronezi.ccpb.domain;

/**
 * Created by pveronezi on 19/11/15.
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Member {
    @Id
    private String id;

    private String name;

    private Address address;

    public Member() {
        address = new Address();
    }

    public Member(String name)
    {
        this();
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
