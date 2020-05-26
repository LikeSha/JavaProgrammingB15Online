package RebootCamp1.day2_ClassesAndObjects;

public class Example {

    public static void main(String[] args) {
        new Example();
    }
    public Example(){

    }
    public Example (int a){
        System.out.println(a);
    }

    public Example(int a,int b){
        this(a);
        System.out.println(b);
    }
}
