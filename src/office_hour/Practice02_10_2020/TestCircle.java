package office_hour.Practice02_10_2020;

class Circle{

    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o){

//        Object o1 = new Circle(3.4);
//        Object o2 = new String();
        if( o instanceof Circle)
            if(radius == ((Circle) o).radius)
            return true;
        return false;
    }

}



public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(3.5);
        Circle c2 = new Circle(4);
        Object c3 = new String();//you can not compare String to Circle



        System.out.println(c1.equals(c2));//true
        System.out.println(c2.equals(c3));

//        new Object().equals();

        Circle c4 = new Circle(7);
        Circle c5 = new Circle(8);

        System.out.println(c4.equals(c5));



    }
}
