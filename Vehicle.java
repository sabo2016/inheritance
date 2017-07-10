package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class Vehicle {
    private int numOfWheels;
    private int milage;

    public Vehicle(int numOfWheels,int milage){
        this.numOfWheels = numOfWheels;
        this.milage = milage;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
}
