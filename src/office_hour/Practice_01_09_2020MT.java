package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_01_09_2020MT {


    public static void main(String[] args) {

        /**
         * Practice Topics :Arraylist
         *                  Array VS ArrayList
         *  Why you need ArrayList : you can do the functions such as add ,remove ....
         *   1, presented in Java.util package
         *   2,What kind of things you can store in ArrayList ,and in Arrays ?
         *      ArrayList only supports non primitives
         *    3,  in ArrayList ,you don't have to specified the size ,because ArrayList the size is
         *    automatically adjusted ( dynamic)
         *    4, ArrayLise does have index number
         *
         *    Array vs ArrayList :
         *    1, ArrayList only supports non primitives ,Array supports all
         *    2, ArrayList size is dynamic ,Array's size is fixed
         *
         * declaration :
         *  1, ArrayList <ObjectType> list = new ArrayList<>();
         *  2, List<ObjectType> list = new ArrayList<>();
         *
         *
         *
         *  ArrayList methods : add,get,size() ,clear,set,contains,equals,remove,IsEmpty,indexOf,
         *  addAll,removeAll,sorting
         *
         *  add(Object);--YOU CAN NOT PASS PRIMITIVE HERE , EVEN YOU PASS PRIMITIVE HERE ,THE COMPILER WILL
         *                CONVERTED IT INTO OBJECT . adds the given objects to the list
         *
         * add(index, Object) --inserts the given object to the given index
         * size(): return the total numbers of the object
         * get(int index) gets the objects from the given index ,returns object
         *
         * clear(): remove all the objects from the list, in other words ,the size of list will be 0
         *
         * set(index, Object) : the object at the index number will be replaced by the given object
         *
         * contains(Object): checks if the given object is exist in the list , it returns boolean expression
         *
         * equals(List): checks if the two lists have same objects or not
         * isEmpty(): checks if the ArrayList size is 0 , returns boolean expression
         * indexOf(Object):returns the index number of the given object, returns primitive int
         *
         * remove(int index): remove the given index number
         * remove(Object):first ,it remove the first matching object of the ArrayList ,then it returns boolean value
         *
         * addAll(CollectionType): adds the collections of objects to the List
         * removeAll(CollectionType):removes all the matching objects from List
         *
         * retainAll(CollectionType): removes all the not matching objects
         *
         * Converting Array to List
         *
         * Arrays.asList(data collection): it returns the data collections as List interface ( collection framework)
         * ONLY THE NONE PRIMITIVE ARRAY CAN BE CONVERTED TO LIST
         *
         * String[] arr = {"A","B"} // now you can pass it to a collection type as below :
         * list<String> list = new ArrayList<>(Arrays.asList(arr)) ;
         */

         int[] arr = new int[5];

         List<Integer> list = new ArrayList<>();
         list.add(10); // by default ,this 10 is defined as int ,but in this add method ,we can only pass
                        // the object ,so compiler automatically convert this primitive  to an object
         // therefore ,this primitive is being converted to a wrapper class Integer --autoboxing .
        System.out.println(list.size()); // 1

        list.add(20); // [10,20]

        list.add(1,30); //[10,30,20]

        System.out.println(list.size());// 2

        int num = list.get(1); // unboxing
        System.out.println(num);//30

        list.clear(); // []
        System.out.println(list.size());

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.set(0,"B");

        System.out.println(list2);

        list2.contains("c"); // since contains method return boolean expression , so we can assign it to
                            // boolean ( store it into boolean type)
        boolean result = list2.contains("c");
        System.out.println(result);

        list2.equals(list);
        System.out.println(list2.equals(list));

        System.out.println(list2.isEmpty());// false

        list2.indexOf("B");//0
        System.out.println(list2.indexOf("B"));   //0
        System.out.println(list2.indexOf("D")); // -1 the given object is ot exist in ArrayList

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        //[1,2,3]
        //int a1 = 1 ; //  this 1 in here is index
        //  when you pass a primitive to a remove method,it removes that index number , in this case
              // the index number 1 is 2 ,so 2 will be removed
        Integer a2 = 1 ; // this 1 in here is an object , not index 1
        //list3.remove(a1);// [1,3]
        list3.remove(a2);// [2,3] a2 is not a primitive ,it is object. if you remove an object it will remove
        //that object in the arrayList ,in this case its list3.add(1);
        // since it returns you a boolean expression ,so you can assign it to boolean
        boolean r1 = list3.remove(a2); // [2,3]

        System.out.println(list3);
        System.out.println(r1);//true  because 1 was remove from the ArrayList

        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("C");
        list4.add("D");

        //list4.remove(2);[A,B,D]
        list4.remove("B"); // [A,C,D]
        System.out.println(list4);


        Integer[] nums = {1,2,3,4,5,6,7,8};
        List<Integer> list5 = Arrays.asList(nums);
        System.out.println(list5);

        String[] students = {"Nursultan", "Irina","Dilshat","Roksana"};
        List<String> names = new ArrayList<>(Arrays.asList(students));
        Arrays.asList(students);
        //names.addAll((Arrays.asList(students));
        names.addAll( Arrays.asList("Mohammad","Bulent","Mustafa"));

        System.out.println(names);

        List<String> grades = new ArrayList<>() ;
        grades.addAll(Arrays.asList("A","B","A","C","D","E","F"));

        grades.removeAll(Arrays.asList("A","C"));

        System.out.println(grades);

        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Corolla","BMW","Jaguar","Honda","Tesla"));


        // remove all the cars that are not BMW OR JAGUAR OR TESLA
        cars.retainAll(Arrays.asList("BMW","Jaguar","Tesla"));
        System.out.println(cars);

        /**
         * Interview questions :
         *  you are given a list ; Ahmet, John, Ahmet, Eric,Aaron
         *  write a program that remove all the names Ahmet.
         */

          List<String> employees = new ArrayList<>();
          employees.addAll(Arrays.asList("Ahmet","Eric","Ahmet","John","Aaron","Ahmet"));

        System.out.println(employees);

        employees.removeAll(Arrays.asList("Ahmet"));

        System.out.println(employees);

        // now ,remove all the name NOT Ahemet // use retainAll method

        List<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmet","Eric","Ahmet","John","Aaron","Ahmet"));

        employees2.retainAll(Arrays.asList("Ahmet"));
        System.out.println(employees2);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        Collections.sort(nums2);

        System.out.println(nums2);
        // sort arrays : Arrays.sort(ArrayName);
        //soring List : Collections.sort(CollectionTypeName)
        // Collection class is presented in Java.Util package








    }
}
