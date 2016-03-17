package br.com.pveronezi.ccpb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pveronezi on 17/12/15.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String street;
    private int number;
    private String complement;
    private String state;
    private String city;
    private String neghborhood;
    private long zipCode;

    public Address() {
    }

    private Address(Builder builder) {
        setStreet(builder.street);
        setNumber(builder.number);
        setComplement(builder.complement);
        setState(builder.state);
        setCity(builder.city);
        setNeghborhood(builder.neghborhood);
        setZipCode(builder.zipCode);
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

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeghborhood() {
        return neghborhood;
    }

    public void setNeghborhood(String neghborhood) {
        this.neghborhood = neghborhood;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }


    public static final class Builder {
        private String street;
        private int number;
        private String complement;
        private String state;
        private String city;
        private String neghborhood;
        private long zipCode;

        public Builder() {
        }

        public Builder street(String val) {
            street = val;
            return this;
        }

        public Builder number(int val) {
            number = val;
            return this;
        }

        public Builder complement(String val) {
            complement = val;
            return this;
        }

        public Builder state(String val) {
            state = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder neghborhood(String val) {
            neghborhood = val;
            return this;
        }

        public Builder zipCode(long val) {
            zipCode = val;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
