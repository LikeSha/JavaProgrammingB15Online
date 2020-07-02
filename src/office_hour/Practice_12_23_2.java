package office_hour;

public class Practice_12_23_2 {
    // return means give output
    public static void main(String[] args) {

        add(5,10);// doesn't give you anything back
//        int result = add(5,10);// this one compile error ,because the method
        //is " void method " it means it does't promise you return anything.
        // in other word, it does't give us any output.
        // method gives you return , so you can store the result to a variable
        //for future re-use ,but if it is void method ,and does'nt give
        //return ,so you can not store the result to any variable.

//        System.out.println(add(5,10)); //it shows compiler error

        int result = addWithReturn(5,10); // gives something back
        System.out.println("result = " + result);
    }

    /**
     * void means --don't give anything back
     * @param num1
     * @param num2
     */

    public static void add(int num1 ,int num2){
        System.out.println(num1 + num2);
    }


    /**
     * int, it's a type of method output
     * @param num1
     * @param num2
     * @return  sum of num1 and num2
     */
    public static int addWithReturn(int num1,int num2){
        return num1 + num2 ;
    }
}
