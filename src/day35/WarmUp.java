package day35;

public class WarmUp {

    public static void main(String[] args) {

        /**
         *
         * Method practice with void and return type
         *
         * return keyword
         *    used to return a value from a method with return type also terminate the method
         *    execution ( any method)
         *
         * Using the methods already created in different classes
         *   in order to use a class outside of your current package import the class
         *      import packageName.className;
         *
         *      a special case for above statement is :
         *        you don't have to import classes from java.lang package
         *        for example String ,System
         *        All the Wrapper classes we are about to learn
         *
         *      in order to use a static method of other classes
         *        ClassName.methodName(....)
         *
         *        in order to use a static method in current class
         *        methodName(...);
         *        OPTIONALLY
         *        ClassName.methodName(...)
         *
         *        Method Overloading :
         *           methods with same name and different parameter list
         *           IN SAME CLASS !!!!
         *
         *           Different parameter list can be :
         *             different parameters count
         *             different parameters type
         *         Method Signature : method name + parameters list
         *
         *         method overloading only care about Method Signature
         *         It does not care about access modifier , return type ,static or not
         *
         *         CAN NOT HAVE 2 METHODS WITH SAME METHOD SIGNATURE .
         *  fly(100);
         * 	fly(100L); -->> This method call expecting a fly method
         * 					that accept long paramter
         * 	class Plane{
         * 		public static void fly(){
         * 			// some code here
         *                }
         * 		public static void fly(int mile){
         * 			// some code here
         *        }
         * 		// CAN NOT HAVE 2 METHODS WITH SAME METHOD SIGNATURE
         * 		// THIS DOES NOT COMPILE
         * 		public static long fly(int mileX){
         * 			// some code here
         *        }* 	}
         * 	class Car{
         * 		public static void fly(int mile){
         * 			// some code here
         * 		}
         * 	}
         I have an employee ID : "FB-457"
         give me the employee number and store it into a number


         */


    }
}
