package InterviewsCodeKnowledge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingInAscendingOrder {

    public static void main(String[] args) {

         // 4,1,4,5,2,3,1
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,2,3,1));
        System.out.println(SortingArrayListAsc(list));

    }

    public static ArrayList<Integer> SortingArrayListAsc(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)<list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
}
