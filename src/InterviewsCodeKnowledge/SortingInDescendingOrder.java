package InterviewsCodeKnowledge;

import java.util.List;

public class SortingInDescendingOrder {

    public static void main(String[] args) {


    }

    public static void SortingArrayListDesc(List<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i) > list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i,list.get(i));
                    list.set(j,temp);
                }
            }
        }
    }
}
