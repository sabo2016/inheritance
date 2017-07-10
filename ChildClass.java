package ninthclass;

/**
 * Created by boruto on 6/29/17.
 */
public class ChildClass extends ParentClass {


    private int count;

    public ChildClass(int count,int value) {

        super(value);
        this.count = count;
    }


    public int getCount(){
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getV(){
        return getValue();
    }

}
