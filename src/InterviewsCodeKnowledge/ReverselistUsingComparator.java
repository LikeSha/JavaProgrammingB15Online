package InterviewsCodeKnowledge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverselistUsingComparator {

    public static void main(String[] args) {


        List<String> lst = new ArrayList<>();
        lst.add("Adam");
        lst.add("John");
        lst.add("Mary");
        lst.add("Diana");

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

        Collections.sort(lst, Comparator.reverseOrder());
        System.out.println(lst);

        /*
         however, if we create our own class type, lets say we created a "Person" class
         public class Person{

         }
         if we want to use Collections.sort method to reverser the Person class list items, it NOT WORKS!
         in order to make it work, first ,we need to make the Person class implements Comparable<Person>
         like this :
         public class Person implements Comparable<Person>{
               String name;
               int age;

               public Person(String name,int age){
                  this.name = name;
                  this.age = age;
               }
               Override
               public String toString(){
                  return "Person [name="+name +", age=" +age + "]";
               }
               Override
               public int compareTo(Person o){

                  return this.name.compareTo(o.name);

//                   if(this.name.charAt(0) >o.name.charAt(0)){
//                        return 1;
//
//                   }else if ( this.name.charAt(0) == o.name.charAt(0)
//                        return 0;
//                   }else{
//                        return -1;
//                   }
         }


         */

    }
}
