package br.com.pveronezi.ccpb.domain;

/**
 * Created by pveronezi on 17/12/15.
 */
public class Address {

    private String street;
    private int number;

    public Address(String street, int number) {
        this.number = number;
        this.street = street;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
