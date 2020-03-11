package homework9.task24;

public abstract class AppForDrinks implements Appliance {
    String waterVolume;
    int waterTemperature;

    public AppForDrinks(String waterVolume, int waterTemperature) {
        this.waterVolume = waterVolume;
        this.waterTemperature = waterTemperature;
    }

    public AppForDrinks() {
    }

    public String getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(String waterVolume) {
        this.waterVolume = waterVolume;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
}
