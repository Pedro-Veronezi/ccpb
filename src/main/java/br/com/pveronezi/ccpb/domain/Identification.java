package br.com.pveronezi.ccpb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pveronezi on 22/12/15.
 */
@Entity
public class Identification {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String rg;
    private String rgDispatcher;
    private String bornState;
    private String bornCity;
    private String matherName;
    private String fatherName;

    public Identification() {
    }

    private Identification(Builder builder) {
        setRg(builder.rg);
        setRgDispatcher(builder.rgDispatcher);
        setBornState(builder.bornState);
        setBornCity(builder.bornCity);
        setMatherName(builder.matherName);
        setFatherName(builder.fatherName);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgDispatcher() {
        return rgDispatcher;
    }

    public void setRgDispatcher(String rgDispatcher) {
        this.rgDispatcher = rgDispatcher;
    }

    public String getBornState() {
        return bornState;
    }

    public void setBornState(String bornState) {
        this.bornState = bornState;
    }

    public String getBornCity() {
        return bornCity;
    }

    public void setBornCity(String bornCity) {
        this.bornCity = bornCity;
    }

    public String getMatherName() {
        return matherName;
    }

    public void setMatherName(String matherName) {
        this.matherName = matherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }


    public static final class Builder {
        private String rg;
        private String rgDispatcher;
        private String bornState;
        private String bornCity;
        private String matherName;
        private String fatherName;

        public Builder() {
        }

        public Builder rg(String val) {
            rg = val;
            return this;
        }

        public Builder rgDispatcher(String val) {
            rgDispatcher = val;
            return this;
        }

        public Builder bornState(String val) {
            bornState = val;
            return this;
        }

        public Builder bornCity(String val) {
            bornCity = val;
            return this;
        }

        public Builder matherName(String val) {
            matherName = val;
            return this;
        }

        public Builder fatherName(String val) {
            fatherName = val;
            return this;
        }

        public Identification build() {
            return new Identification(this);
        }
    }
}
