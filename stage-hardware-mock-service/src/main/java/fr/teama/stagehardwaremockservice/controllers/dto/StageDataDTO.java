package fr.teama.stagehardwaremockservice.controllers.dto;

public class StageDataDTO {

    private int stageLevel;

    private Double fuel;

    private boolean isActivated;

    public StageDataDTO(int stageLevel, Double fuel) {
        this.stageLevel = stageLevel;
        this.fuel = fuel;
        this.isActivated = false;
    }

    public int getStageLevel() {
        return stageLevel;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    @Override
    public String toString() {
        return "StageData{" +
                "stageLevel=" + stageLevel +
                ", fuel=" + fuel +
                '}';
    }
}
