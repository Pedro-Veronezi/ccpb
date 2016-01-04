package br.com.pveronezi.ccpb.domain.enumeration;

/**
 * Created by pveronezi on 22/12/15.
 */
public enum VocationalAreaType {
    CHILD("Crianças"), JUNIORS("Juniors"), TEENAGERS("Adolescentes");

    private final String value;

    VocationalAreaType(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
