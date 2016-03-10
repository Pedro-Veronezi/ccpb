package br.com.pveronezi.ccpb.domain.enumeration;

/**
 * Created by pveronezi on 22/12/15.
 */
public enum TheologicalTrainingType {
    NO_FORMATION("Sem formação"), BASIC("Basico"), MEDIUM("Medio"), BACHELOR("Bacharel");


    private final String value;

    TheologicalTrainingType(String s) {
        value = s;
    }

    public String getValue() {
        return value;
    }


}
