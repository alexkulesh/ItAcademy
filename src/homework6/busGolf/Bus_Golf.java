package homework6.busGolf;

/**
 * Task Bus_Golf. You have 2 vehicles with given name, fuel tank capacity, fuel consumption
 * and a year of production. Find out which vehicle can drive a longer distance, and which
 * vehicle is newer.
 */
public class Bus_Golf {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ikarus", 32, 1980, 210);
        Vehicle v2 = new Vehicle("Golf", 10, 1995, 60);
        Vehicle.compareByTripLength(v1,v2);
        Vehicle.compareByYear(v1,v2);
    }
}
