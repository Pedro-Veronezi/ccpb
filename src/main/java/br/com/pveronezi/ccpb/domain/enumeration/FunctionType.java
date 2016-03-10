package br.com.pveronezi.ccpb.domain.enumeration;

/**
 * Created by pveronezi on 22/12/15.
 */
public enum FunctionType {
    DIAKONIA("Diaconia"), PRESBYTERY("Presbitério");

    private final String value;

    FunctionType(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }
}
