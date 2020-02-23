package day53;

public class FruitShop {

    // Only Reference Type Decide what you can access at compile time
    //if we have Fruit as reference type , getDigested method will point to the one under Fruit class
    //Actual object type decide what method will be called at run time
    //since actual object

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");

        //what can I access using reference variable a1
        //a1 has Apple as reference type , so we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        // what method I can access on Apple ?
        a1.getDigested();

        System.out.println("//--------------------------------------");
        Fruit f1 = a1;//new Apple("sweet","red","Fuji");
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        //f1.type  NOT WORKING because Fruit class does not have any type variable !!
        // we can not access type coming from apple if we refer it as Fruit ,ONLY
        //REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS !!!!

        //if Fruit does not have getDigested method
        //below will not compile
        //because only reference type decide what you can access !!!
        // YOU CAN NOT SIMPLY CALL SOMETHING YOU DON'T HAVE !!
        f1.getDigested();
        f1 = new Orange("sour-sweet","redish",11);
        f1.getDigested();

        System.out.println(f1.toString());//System.out.println(f1); same result



        // Fruit is reference type  ,Apple is actual object Type
        Fruit f2 = new Apple("crispy but tasteless","hot red","Gala");
        Fruit f3 = new Orange("sour","orange",12);
        Fruit f4 = new Orange("very sweet","blood",10);

        Fruit[] myFruit = {f1,f2,f3,f4};

        for(Fruit each : myFruit){

            each.getDigested();

        }



    }
}
