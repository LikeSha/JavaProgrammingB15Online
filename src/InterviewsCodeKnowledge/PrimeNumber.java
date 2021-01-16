package InterviewsCodeKnowledge;

import java.util.Enumeration;

/*
 TASK-1 Create a method that will accept a number
 and print all the prime number from 2 to that given number
  */
public class PrimeNumber {

     public static void main(String[] args) {
          printAllTo(100);
         System.out.println(isPrime(100));

     }

     public static void printAllTo(int num){
         for (int i = 2; i <=num; i++) {
             if(isPrime(i)){
                 System.out.println(i);
             }
         }
     }

     public static boolean isPrime(int num){

         for (int i = 2; i <num ; i++) {

             if( num % i == 0) return false;

         }
         return true;
     }




 }
