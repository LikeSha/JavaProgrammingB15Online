package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {

        //SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementing class is TreeSet

        SortedSet<Integer> mySet = new TreeSet<>(); // TreeSet is SortedSet implementation
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);

        System.out.println("mySet = " + mySet);
        //There are few extra method available in sorted set because it's already sorted
        System.out.println("mySet.first() = " + mySet.first());
        System.out.println("mySet.last() = " + mySet.last());

        /*
        SortedSet<E> subSet(E fromElement, E toElement);
        SortedSet<E> headSet(E toElement)
        SortedSet<E> tailSet(E fromElement)

         sortedSet<Long> longTreeSet = new TreeSet<>();
                                longTreeSet.add(3l);
                                longTreeSet.add(5L);
                                longTreeSet.add(18L);
                                longTreeSet.add(21L);
                                System.out.println(longTreeSet);
            System.out.println("longTreeSet.subSet(5L,21L):"+ longTreeSet.subSet(5L,21L);
             result : 5,18
            System.out.println("longTreeSet.headSet(18L):"+ longTreeSet.subSet(18L);
            result : 3,5
            System.out.println("longTreeSet.tailSet(18L):"+ longTreeSet.subSet(18L);
            result: 18,21

            SortedSet<Long> tailView = longTreeSet.tailSet(18L);
            tailView.remove(18L);
            System.out.println(tailView);  result : 3,5,21
            System.out.println(longTreeSet);  result : 3,5,21
         */





    }
}
