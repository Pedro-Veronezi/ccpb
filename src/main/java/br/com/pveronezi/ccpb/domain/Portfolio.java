package br.com.pveronezi.ccpb.domain;

import br.com.pveronezi.ccpb.domain.enumeration.VocationalAreaType;

import java.util.Calendar;

/**
 * Created by pveronezi on 22/12/15.
 */
public class Portfolio {
    private boolean participatedConhecendoComuna;
    private Calendar baptismDate;
    private String historic;
    private TheologicalTrainingType theologicalTraining;
    private VocationalAreaType vocationalArea;
    private String profession;

    public Portfolio() {
    }

    private Portfolio(Builder builder) {
        setParticipatedConhecendoComuna(builder.participatedConhecendoComuna);
        setBaptismDate(builder.baptismDate);
        setHistoric(builder.historic);
        setTheologicalTraining(builder.theologicalTraining);
        setVocationalArea(builder.vocationalArea);
        setProfession(builder.profession);
    }

    public boolean isParticipatedConhecendoComuna() {
        return participatedConhecendoComuna;
    }

    public void setParticipatedConhecendoComuna(boolean participatedConhecendoComuna) {
        this.participatedConhecendoComuna = participatedConhecendoComuna;
    }

    public Calendar getBaptismDate() {
        return baptismDate;
    }

    public void setBaptismDate(Calendar baptismDate) {
        this.baptismDate = baptismDate;
    }

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
    }

    public TheologicalTrainingType getTheologicalTraining() {
        return theologicalTraining;
    }

    public void setTheologicalTraining(TheologicalTrainingType theologicalTraining) {
        this.theologicalTraining = theologicalTraining;
    }

    public VocationalAreaType getVocationalArea() {
        return vocationalArea;
    }

    public void setVocationalArea(VocationalAreaType vocationalArea) {
        this.vocationalArea = vocationalArea;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    public static final class Builder {
        private boolean participatedConhecendoComuna;
        private Calendar baptismDate;
        private String historic;
        private TheologicalTrainingType theologicalTraining;
        private VocationalAreaType vocationalArea;
        private String profession;

        public Builder() {
        }

        public Builder participatedConhecendoComuna(boolean val) {
            participatedConhecendoComuna = val;
            return this;
        }

        public Builder baptismDate(Calendar val) {
            baptismDate = val;
            return this;
        }

        public Builder historic(String val) {
            historic = val;
            return this;
        }

        public Builder theologicalTraining(TheologicalTrainingType val) {
            theologicalTraining = val;
            return this;
        }

        public Builder vocationalArea(VocationalAreaType val) {
            vocationalArea = val;
            return this;
        }

        public Builder profession(String val) {
            profession = val;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}
