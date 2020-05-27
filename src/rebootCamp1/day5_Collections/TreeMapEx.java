package rebootCamp1.day5_Collections;

import java.util.TreeMap;

public class TreeMapEx {

    public static void main(String[] args) {

        TreeMap<Integer, String > map = new TreeMap<>(); // TreeMap not allowing any null key

        map.put(3,"three"); // I added this line of code at the last , but the order must be naturally
           // which means the output would be : {1=one, 2=two, 3=three, 4=four}
        map.put(4,"four");
//        map.put(null,"this null");
        map.put(2,"two");
        map.put(1,"one");

        System.out.println(map);

    }
}
