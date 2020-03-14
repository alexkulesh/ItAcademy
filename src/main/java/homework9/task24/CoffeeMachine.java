package main.java.homework9.task24;

public class CoffeeMachine extends AppForDrinks {
    private int cupNumber;
    private String workPressure;

    public CoffeeMachine(String waterVolume, int waterTemperature, int cupNumber, String workPressure) {
        super(waterVolume, waterTemperature);
        this.cupNumber = cupNumber;
        this.workPressure = workPressure;
    }

    public CoffeeMachine(int cupNumber, String workPressure) {
        this.cupNumber = cupNumber;
        this.workPressure = workPressure;
    }

    public int getCupNumber() {
        return cupNumber;
    }

    public void setCupNumber(int cupNumber) {
        this.cupNumber = cupNumber;
    }

    public String getWorkPressure() {
        return workPressure;
    }

    public void setWorkPressure(String workPressure) {
        this.workPressure = workPressure;
    }

    @Override
    public void setWaterVolume(String waterVolume) {
        super.setWaterVolume(waterVolume);
    }

    @Override
    public void setWaterTemperature(int waterTemperature) {
        super.setWaterTemperature(waterTemperature);
    }

    @Override
    public boolean pluggedIn() {
        return false;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "cupNumber=" + cupNumber +
                ", workPressure=" + workPressure +
                ", waterVolume=" + waterVolume +
                ", waterTemperature=" + waterTemperature +
                '}';
    }
}
