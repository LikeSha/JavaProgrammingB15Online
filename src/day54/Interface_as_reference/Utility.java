package day54.Interface_as_reference;

import day54.Interface_as_reference.*;

public class Utility {

    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new MakeUps();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        //wearMyWearable( new String()); CAN NOT ! BECAUSE IT ASKING WEARABLE ,
        // STRING() IS NOT A WEARABLE !!!!

        // here directly passing the object without storing into a variable
        // we made it static so we can just call it directly
        wearMyWearable( new Watch());

        System.out.println("\n ---calling the getMyWearableObject---\n");
        Wearable result = getMyWearableObject();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());
        wearMyWearable(result);





    }
     //  create a static method called getMyWearableObject
     // it return a Wearable object ( o anything IS-A Wearable)

    public static Wearable getMyWearableObject(){

//        Wearable w = new Clothes();
//        return w;
        return new Clothes();
//        return new Watch();  you can return any of wearable objects !!
//        return new Perfume();
//        return new MakeUps();

    }



// Create a static void method wearMyWearable
//it has 1 parameter with type Wearable
    public static void wearMyWearable(Wearable any){

        any.wear();

    }


}

