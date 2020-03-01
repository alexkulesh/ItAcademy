package Homework6.Bus_Golf;

public class Vehicle {
    private String VehicleType;
    private float fuelConsumption;
    private int yearOfProduction;
    private float fuelTankCapacity;

    public Vehicle(String VehicleType, float fuelConsumption, int yearOfProduction, float fuelTankCapacity) {
        this.VehicleType = VehicleType;
        this.fuelConsumption = fuelConsumption;
        this.yearOfProduction = yearOfProduction;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public float tripLength() {
        return fuelTankCapacity / fuelConsumption;
    }

    public static void compareByYear(Vehicle first, Vehicle second) {
        if (first.getYearOfProduction() > second.getYearOfProduction()) {
            System.out.println("First vehicle is newer than second vehicle");
        }
        if (first.getYearOfProduction() < second.getYearOfProduction()) {
            System.out.println("Second vehicle is newer than first vehicle");
        }
        if (first.getYearOfProduction() == second.getYearOfProduction()) {
            System.out.println("Both vehicles are the same year of production");
        }
    }

    public static void compareByTripLength(Vehicle first, Vehicle second) {
        if (first.tripLength() > second.tripLength()) {
            System.out.println("First vehicle would drive a longer distance");
        }
        if (first.tripLength() < second.tripLength()) {
            System.out.println("Second vehicle would drive a longer distance");
        }
        if (first.tripLength() == second.tripLength()) {
            System.out.println("Both vehicles would drive the same distance");
        }
    }
}