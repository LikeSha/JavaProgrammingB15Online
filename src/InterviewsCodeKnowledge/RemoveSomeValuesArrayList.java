package InterviewsCodeKnowledge;

import java.util.*;

public class RemoveSomeValuesArrayList {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        // solution 1 :

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        ArrayList<Integer> list2 = new ArrayList<>();

        for(Integer each : list1){
            if(each<100){
                list2.add(each);

            }

        }
        list1=list2;
        System.out.println("list1 = " + list1);

        System.out.println();

        System.out.println("------------solution 2 Iterator---------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }

        System.out.println("list = " + list);

        System.out.println();

        System.out.println("-----------------------solution 3 ListIterator<Integer>-----------------");

        List<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        for(ListIterator<Integer> il =lst.listIterator();il.hasNext();){
            if(il.next()>100){
                il.remove();
            }
        }

        System.out.println("lst = " + lst);

        System.out.println();

        System.out.println("---------------solution 4 removeIf(p->p>100)------------------------------");

        ArrayList<Integer> listtt =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        listtt.removeIf(p->p>100);
        System.out.println("listtt = " + listtt);

    }
}
