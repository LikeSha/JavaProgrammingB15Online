package InterviewsCodeKnowledge;

import org.w3c.dom.ls.LSOutput;

public class ConcateTwoArray {

    public static void main(String[] args) {

        // need to find out solution ,below are not correct
        
        int[] group1 = {2,4,8,43,32};
        int[] group2 = { 3,9,33,40,21};
        

        System.out.println("concatTwoArrays(group1,group2) = " + concatTwoArrays(group1,group2));
        
        
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2){
        
        int[] result = new int[arr1.length + arr2.length];
        
        int i = 0;

        for(int each : arr1){
            result[i]=each;
            i++;
        }
        
        for(int each : arr2){
            result[i] = each;
            i++;
        }
        
        return result;


    }


}
