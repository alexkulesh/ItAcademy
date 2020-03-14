package main.java.homework9.task24;

public class Kettle extends AppForDrinks {
    private String material;

    public Kettle(String waterVolume, int waterTemperature, String material) {
        super(waterVolume, waterTemperature);
        this.material = material;
    }

    public Kettle(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        return true;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "material='" + material + '\'' +
                ", waterVolume=" + waterVolume +
                ", waterTemperature=" + waterTemperature +
                '}';
    }
}
