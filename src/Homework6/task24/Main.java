package homework6.task24;

/**
 * Task 24. Create a hierarchy of classes describing household appliances.
 * Create several objects of the described classes, part of them should be
 * plugged in. The hierarchy must have at least three levels.
 */
public class Main {
    public static void main(String[] args) {
        final Kettle kettle = new Kettle("metal");
        final CoffeeMachine coffeeMachine = new CoffeeMachine(2, 10);
        kettle.setWaterVolume(2);
        kettle.setWaterTemperature(90);
        coffeeMachine.setWaterVolume(1);
        coffeeMachine.setWaterTemperature(100);
        System.out.println(kettle.toString());
        System.out.println(coffeeMachine.toString());
        final ElectricOven electricOven = new ElectricOven(4);
        final Microwave microwave = new Microwave(800);
        electricOven.setCookingTemp(200);
        microwave.setCookingTemp(100);
        System.out.println(electricOven.toString());
        System.out.println(microwave.toString());
        final Fridge fridge = new Fridge(2);
        fridge.setStoringTemp(5);
        fridge.setStorageVolume("40 Litres");
        System.out.println(fridge.toString());
    }
}
