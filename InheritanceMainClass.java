package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class InheritanceMainClass {
    public static void main(String[] args) {
        ChildClass c = new ChildClass(5,9);
        //c.setValue(5);
        System.out.println("value= "+c.getValue());
        //c.setCount(9);
        System.out.println("count= "+c.getCount());
    }
}
