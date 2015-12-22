package br.com.pveronezi.ccpb.domain;

/**
 * Created by pveronezi on 19/11/15.
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;

@Document
public class Member {
    @Id
    private String id;
    private String name;
    private Calendar birthday;
    private MatrialState matrialState;
    private Calendar dateAdmission;
    private AdmittedType admittedFor;
    private boolean baptized;
    private String churchBaptized;
    private String lastChurch;
    private FunctionType function;
    private String email;
    private byte[] photo;
    private Address address = new Address.Builder().build();
    private PhoneNumber phoneNumber = new PhoneNumber.Builder().build();
    private Portfolio portfolio = new Portfolio.Builder().build();
    private Identification identification = new Identification.Builder().build();

    private Member(Builder builder) {
        id = builder.id;
        name = builder.name;
        birthday = builder.birthday;
        matrialState = builder.matrialState;
        dateAdmission = builder.dateAdmission;
        admittedFor = builder.admittedFor;
        baptized = builder.baptized;
        churchBaptized = builder.churchBaptized;
        lastChurch = builder.lastChurch;
        function = builder.function;
        email = builder.email;
        photo = builder.photo;
        address = builder.address;
        phoneNumber = builder.phoneNumber;
        portfolio = builder.portfolio;
        identification = builder.identification;
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

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public MatrialState getMatrialState() {
        return matrialState;
    }

    public void setMatrialState(MatrialState matrialState) {
        this.matrialState = matrialState;
    }

    public Calendar getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(Calendar dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public AdmittedType getAdmittedFor() {
        return admittedFor;
    }

    public void setAdmittedFor(AdmittedType admittedFor) {
        this.admittedFor = admittedFor;
    }

    public boolean isBaptized() {
        return baptized;
    }

    public void setBaptized(boolean baptized) {
        this.baptized = baptized;
    }

    public String getChurchBaptized() {
        return churchBaptized;
    }

    public void setChurchBaptized(String churchBaptized) {
        this.churchBaptized = churchBaptized;
    }

    public String getLastChurch() {
        return lastChurch;
    }

    public void setLastChurch(String lastChurch) {
        this.lastChurch = lastChurch;
    }

    public FunctionType getFunction() {
        return function;
    }

    public void setFunction(FunctionType function) {
        this.function = function;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public static final class Builder {
        private String id;
        private String name;
        private Calendar birthday;
        private MatrialState matrialState;
        private Calendar dateAdmission;
        private AdmittedType admittedFor;
        private boolean baptized;
        private String churchBaptized;
        private String lastChurch;
        private FunctionType function;
        private String email;
        private byte[] photo;
        private Address address;
        private PhoneNumber phoneNumber;
        private Portfolio portfolio;
        private Identification identification;

        public Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder birthday(Calendar val) {
            birthday = val;
            return this;
        }

        public Builder matrialState(MatrialState val) {
            matrialState = val;
            return this;
        }

        public Builder dateAdmission(Calendar val) {
            dateAdmission = val;
            return this;
        }

        public Builder admittedFor(AdmittedType val) {
            admittedFor = val;
            return this;
        }

        public Builder baptized(boolean val) {
            baptized = val;
            return this;
        }

        public Builder churchBaptized(String val) {
            churchBaptized = val;
            return this;
        }

        public Builder lastChurch(String val) {
            lastChurch = val;
            return this;
        }

        public Builder function(FunctionType val) {
            function = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder photo(byte[] val) {
            photo = val;
            return this;
        }

        public Builder address(Address val) {
            address = val;
            return this;
        }

        public Builder phoneNumber(PhoneNumber val) {
            phoneNumber = val;
            return this;
        }

        public Builder portfolio(Portfolio val) {
            portfolio = val;
            return this;
        }

        public Builder identification(Identification val) {
            identification = val;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }
}
