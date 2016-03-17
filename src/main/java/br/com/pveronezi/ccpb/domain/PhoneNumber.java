package br.com.pveronezi.ccpb.domain;

import br.com.pveronezi.ccpb.domain.enumeration.PhoneType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by pveronezi on 22/12/15.
 */
@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private long number;
    private int ddd;
    private int extensionLine;
    private PhoneType type;

    public PhoneNumber() {
    }

    private PhoneNumber(Builder builder) {
        setNumber(builder.number);
        setDdd(builder.ddd);
        setExtensionLine(builder.extensionLine);
        setType(builder.type);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getExtensionLine() {
        return extensionLine;
    }

    public void setExtensionLine(int extensionLine) {
        this.extensionLine = extensionLine;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }


    public static final class Builder {
        private long number;
        private int ddd;
        private int extensionLine;
        private PhoneType type;

        public Builder() {
        }

        public Builder number(long val) {
            number = val;
            return this;
        }

        public Builder ddd(int val) {
            ddd = val;
            return this;
        }

        public Builder extensionLine(int val) {
            extensionLine = val;
            return this;
        }

        public Builder type(PhoneType val) {
            type = val;
            return this;
        }

        public PhoneNumber build() {
            return new PhoneNumber(this);
        }
    }
}
