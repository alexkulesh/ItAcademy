package homework9.task24;

public class Fridge extends AppForFoodStoring {
    private int cameraNumber;

    public Fridge(int storingTemp, String storageVolume, int cameraNumber) {
        super(storingTemp, storageVolume);
        this.cameraNumber = cameraNumber;
    }

    public Fridge(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    public int getCameraNumber() {
        return cameraNumber;
    }

    public void setCameraNumber(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    @Override
    public void setStoringTemp(int storingTemp) {
        super.setStoringTemp(storingTemp);
    }

    @Override
    public void setStorageVolume(String storageVolume) {
        super.setStorageVolume(storageVolume);
    }

    @Override
    public boolean pluggedIn() {
        return true;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "cameraNumber=" + cameraNumber +
                ", storingTemp=" + storingTemp +
                ", storageVolume='" + storageVolume + '\'' +
                '}';
    }
}
