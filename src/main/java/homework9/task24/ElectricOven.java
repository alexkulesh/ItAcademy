package main.java.homework9.task24;

public class ElectricOven extends AppForCooking {
    private int cameraNumber;

    public ElectricOven(int cookingTemp, int cameraNumber) {
        super(cookingTemp);
        this.cameraNumber = cameraNumber;
    }

    public ElectricOven(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    public int getCameraNumber() {
        return cameraNumber;
    }

    public void setCameraNumber(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    @Override
    public void setCookingTemp(int cookingTemp) {
        super.setCookingTemp(cookingTemp);
    }

    @Override
    public boolean pluggedIn() {
        return false;
    }

    @Override
    public String toString() {
        return "ElectricOven{" +
                "cameraNumber=" + cameraNumber +
                ", cookingTemp=" + cookingTemp +
                '}';
    }
}
