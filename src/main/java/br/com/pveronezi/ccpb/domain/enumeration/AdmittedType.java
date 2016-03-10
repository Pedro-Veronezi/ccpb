package br.com.pveronezi.ccpb.domain.enumeration;

/**
 * Created by pveronezi on 22/12/15.
 */
public enum AdmittedType {
    LETTER("Carta"), ACCLAIM("Aclamação");

    private final String value;

    AdmittedType(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }
}
