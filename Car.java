package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class Car extends Vehicle{
    private String brand;

    public Car(int numOfWheels,int milage,String brand){
        super(numOfWheels,milage);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
