package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class Insect {
    private String color;
    private boolean flyingAbility;

    public Insect(String color, boolean flyingAbility) {
        this.color = color;
        this.flyingAbility = flyingAbility;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(boolean flyingAbility) {
        this.flyingAbility = flyingAbility;
    }
    public void print(){
        System.out.println("color = "+color);
        System.out.println("can fly? = "+flyingAbility);

    }

}
