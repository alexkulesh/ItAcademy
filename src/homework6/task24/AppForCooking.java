package homework6.task24;

public abstract class AppForCooking implements Appliance {
    int cookingTemp;

    public AppForCooking(int cookingTemp) {
        this.cookingTemp = cookingTemp;
    }

    public AppForCooking() {
    }

    public int getCookingTemp() {
        return cookingTemp;
    }

    public void setCookingTemp(int cookingTemp) {
        this.cookingTemp = cookingTemp;
    }
}
