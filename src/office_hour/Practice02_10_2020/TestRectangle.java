package office_hour.Practice02_10_2020;

class Rectangle{
    public double l, w;

    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    public boolean equals(Object o){

        if(o instanceof Rectangle){
            double Area1 = l*w;
            double Area2 = ((Rectangle) o).l * ((Rectangle) o).w;
            if(Area1 == Area2){
                return true;
            }
        }
        return false;
    }
}

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle(4,3);

        System.out.println(r1.equals(r2));

//        new Object().equals();
    }

}
