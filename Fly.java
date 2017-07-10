package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class Fly extends Insect{
    public Fly(String color, boolean flyingAbility) {
        super(color, flyingAbility);
    }
    public void print(){
        System.out.println("Name: HouseFly");
        super.print();
    }
}
