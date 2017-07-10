package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class VehicleCarMainClass {
    public static void main(String[] args) {
        Car c= new Car(4,50,"BMW");
        System.out.println("Brand = "+c.getBrand());
        System.out.println("numOfWheels = "+c.getNumOfWheels());
        System.out.println("milage = "+c.getMilage());

    }
}
