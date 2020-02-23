package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {

    public static void main(String[] args) {


        System.out.println( getListFrom1TillFinalNumber(7)     );
        System.out.println( getListFrom1TillFinalNumber(2)     );
        System.out.println( getListFrom1TillFinalNumber(20)    );
        // why we can directly print it ? because this method returns value ,so we can direct print it

        List<Integer> myList = getListFrom1TillFinalNumber(25);
        // to decide return type just look at the call method data type in this case is
        // List<Integer>
        // second option is let IDE do the job for you , just pointing at myList ,and there is an
        // indication tells you what data type you should choose to store
        System.out.println("myList = " + myList);
    }
    // Create a method that accept a finalNumber as int
    // return an ArrayList of Integer containing numbers
     // starting from 1 till finalNumber

    /**
     * This method will return a List of Integer that containing numbers
     * starting from 1 till finalNumber
     *
     * @param finaNumber This is the last item of the list
     * @return List<Integer> that contains 1 till final numbers increased by 1
     */
        public static List<Integer> getListFrom1TillFinalNumber(int finaNumber){

            List<Integer> nums = new ArrayList<>();
            for (int numbers = 1; numbers <=finaNumber ; numbers++) {
                nums.add(numbers);
            }
            //System.out.println("nums = " + nums);
            return nums ;
        }
}
