package rebootCamp1.day4_OOP;

public class ClassOne implements Teachable,Moveable {

    @Override
    public void teachMath() {
        System.out.println(Teachable.size);
    }

    @Override
    public void moveTo() {

    }
}
