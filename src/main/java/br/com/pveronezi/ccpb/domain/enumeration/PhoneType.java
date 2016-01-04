package br.com.pveronezi.ccpb.domain.enumeration;

/**
 * Created by pveronezi on 22/12/15.
 */
public enum PhoneType {
    COMERCIAL("Comercial"), CELLPHONE("Celular"), RESIDENCIAL("Residencial");

    private final String value;

    PhoneType(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
