package homework9.task24;

public class Microwave extends AppForCooking {
    private int maxPower;

    public Microwave(int cookingTemp, int maxPower) {
        super(cookingTemp);
        this.maxPower = maxPower;
    }

    public Microwave(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
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
        return "Microwave{" +
                "maxPower=" + maxPower +
                ", cookingTemp=" + cookingTemp +
                '}';
    }
}
