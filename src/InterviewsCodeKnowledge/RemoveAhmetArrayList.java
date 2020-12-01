package InterviewsCodeKnowledge;

import java.util.*;

public class RemoveAhmetArrayList {
    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        System.out.println("------------------solution 1------------------------------");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println("names = " + names);

        System.out.println();



        System.out.println("------------------solution 2----------------------------------");

        List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed","John","Eric","Ahmed"));
        for(ListIterator<String> it = names2.listIterator();it.hasNext();){
            if(it.next().equals("Ahmed")){
                it.remove();;
            }
        }
        System.out.println("names2 = " + names2);

        System.out.println();



        System.out.println("---------------------------solution 3----------------------------------");

        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        List<String> names33 = new ArrayList<>();
        names.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );

        System.out.println(names3);

        System.out.println();


        System.out.println("------------------solution 4 Iterator remove----------------------------------");

        List<String> names4 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        Iterator<String> it = names4.iterator();
        while(it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }

        System.out.println(names4);


    }
}
