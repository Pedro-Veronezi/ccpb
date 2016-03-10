package br.com.pveronezi.ccpb.domain;

/**
 * Created by pveronezi on 22/12/15.
 */
public enum MaritalStatus {
    SINGLE("Solteiro(a)"), MERRIED("Casado(a)");

    private final String value;

    MaritalStatus(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }
}
