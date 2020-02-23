package day43;

public class ConstructorReview {

    /**
     * Integer i1 = new Integer(12);
     * // how the constructor for Integer might look like
     * public Integer (int num){
     *     // some code here
     * }
     * Integer i1 = new Integer("12");
     * public Integer(String num){
     *     // some code here
     *
     * }
     *
     * Constructor is a block of code that run when object is being created
     * it has same name as class name
     * and has no return type
     * it can be overloaded
     *
     * Most use case of constructor is
     *    to provide initial state (attribute values)
     *    for the object while being created
     *
     *    public Coffee{
     *
     *        private String type ;
     *        private int caffineLevel;
     *        private double price;
     *
     *        // getters and setters here omitted
     *        // no arg constructor
     *        public Coffee(){
     *            // print ( "no arg constructor")
     *        }
     *        // 2 args constructor to set type and caffine level
     *        public Coffee (String type, int caffeineLevel){
     *            this.type = type;
     *            this.caffeineLevel = caffineLevel;
     *        }
     *
     *        // wake up task to create 3 args constructor
     *        // do not let the price go below 0
     *        // if it is less than 0 make it $1
     *
     *        public Coffee(String type,int coffeineLevel,double price){
     *            this,type = type;
     *            this caffeineLevel = caffineLevel;
     *            if(price<0){
     *                price = 1;
     *
     *            }else{
     *                 this.price = price;
     *            }
     *        }
     *
     *
     *    }
     *
     *
     *
     *    Method review : the 3 categories
     *
     *    parameter :
     *      method that has parameter or does not have parameter
     *      return type ;
     *      void method or method with return type
     *   need an object to be called ?
     *   static method
     *   instance method
     *
     *   EVery time you crate a class , it will be a type
     *   all these classes you created
     *   Movie,Coffee,Car,Bike,TV,Person
     *   can be a data type
     *      what you can do with the data type ???
     *      you can create object out of it --
     *      in the meantime , it an be your variable data type
     *      TV t1 ;
     *      How many places we used data type other creating object
     *      you used it for local variable data type
     *      TV t1 = a tv object
     *
     *      it can be used for method parameter just like string
     *      public static void printString(String str) {}
     *       public static void repairTVparts(TV yourTvObj){}
     *
     *       it can be method return type just like String
     *       public static String giveMeYourName(){return "java"}
     *       public static TV giveMeYourTV(){
     *          // return any TV Object
     *          return new TV();
     *       }
     *
     *     // where else did we see variable ?
     *     // this is a Enjine class, blueprint of engine object
     *     public class Engine{
     *
     *     }
     *     // this is a Car class, blueprint of engine object
     *     public class Car{
     *         String make;
     *         Engine e;
     *     }
     *
     *     String[] myArray;
     *     Car[] myCars;
     *     List<Car> myCarLst;
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
