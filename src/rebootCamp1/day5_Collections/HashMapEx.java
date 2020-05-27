package rebootCamp1.day5_Collections;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>(); // key is integer value is String

//        map.add // this one now works ! mus use map method " push " to add
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(2,"2");// we can not have duplicate key , but this line just replace value to 2
                       // value replaced from " two " to " 2 "
        map.put(null, "null");

        System.out.println(map);


    }
}
