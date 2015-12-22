package br.com.pveronezi.ccpb.domain;

/**
 * Created by pveronezi on 22/12/15.
 */
public class PhoneNumber {
    private long number;
    private int ddd;
    private int extensionLine;
    private PhoneType type;

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
