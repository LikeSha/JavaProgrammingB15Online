package selfStudyFolder.oopConcertPart1;

public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.sum();
        obj.sum(10);
        obj.sum(10,5);

    }
   // Interview question : can you overloading main method ? Answer : YES !!! We can overload main method.
    public static void main(int p){

    }

    public static void main(int a, int h){

    }

    // you can not create a method inside a method
    //duplicate methods---i.e. same method name with same number of arguments are not allowed

    // Interview question : what is method overloading ?
    // method overloading --> when the method name is same with different arguments or input
    // parameters within the same class
    public void sum(){ // 0 input parameters
        System.out.println("SUM method--zero param");
    }

    public void sum(int i){// 1 input parameter
        System.out.println("Sum method--1 input param");
        System.out.println(i);
    }

    public void sum(double i){ // 1 input param but different data type is allowed ,one is int
                              // another one is double

    }
    public void sum(int k,int l){// 2 input parameters
        System.out.println("sum method---2 input param");
        System.out.println(k+l);

        // AS LONG AS METHOD SIGNATURE DIFFERENT IS FINE.
    }



}
