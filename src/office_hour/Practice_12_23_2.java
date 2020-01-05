package office_hour;

public class Practice_12_23_2 {
    // return means give output
    public static void main(String[] args) {

        add(5,10);// doesn't give you anything back
        int result = addWithReturn(5,10); // gives something back
        System.out.println("result = " + result);
    }

    public static void add(int num1 ,int num2){
        System.out.println(num1 + num2);
    }

    public static int addWithReturn(int num1,int num2){
        return num1 + num2 ;
    }
}
