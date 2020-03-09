package homework6.task24;

public class CoffeeMachine extends AppForDrinks {
    private int cupNumber;
    private int workPressure;

    public CoffeeMachine(int waterVolume, int waterTemperature, int cupNumber, int workPressure) {
        super(waterVolume, waterTemperature);
        this.cupNumber = cupNumber;
        this.workPressure = workPressure;
    }

    public CoffeeMachine(int cupNumber, int workPressure) {
        this.cupNumber = cupNumber;
        this.workPressure = workPressure;
    }

    public int getCupNumber() {
        return cupNumber;
    }

    public void setCupNumber(int cupNumber) {
        this.cupNumber = cupNumber;
    }

    public int getWorkPressure() {
        return workPressure;
    }

    public void setWorkPressure(int workPressure) {
        this.workPressure = workPressure;
    }

    @Override
    public void setWaterVolume(int waterVolume) {
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
