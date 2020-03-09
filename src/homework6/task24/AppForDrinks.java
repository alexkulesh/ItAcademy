package homework6.task24;

public abstract class AppForDrinks implements Appliance {
    int waterVolume;
    int waterTemperature;

    public AppForDrinks(int waterVolume, int waterTemperature) {
        this.waterVolume = waterVolume;
        this.waterTemperature = waterTemperature;
    }

    public AppForDrinks() {
    }

    public int getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
}
