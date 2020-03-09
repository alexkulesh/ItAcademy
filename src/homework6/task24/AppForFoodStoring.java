package homework6.task24;

public abstract class AppForFoodStoring implements Appliance {
    int storingTemp;
    String storageVolume;

    public AppForFoodStoring(int storingTemp, String storageVolume) {
        this.storingTemp = storingTemp;
        this.storageVolume = storageVolume;
    }

    public AppForFoodStoring() {
    }

    public int getStoringTemp() {
        return storingTemp;
    }

    public void setStoringTemp(int storingTemp) {
        this.storingTemp = storingTemp;
    }

    public String getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(String storageVolume) {
        this.storageVolume = storageVolume;
    }
}
