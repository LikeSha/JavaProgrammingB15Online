package day54;

public class AnimalShow {

    public static void main(String[] args) {

// Dog IS-A Dog
//Dog IS-A Animal
//Dog IS-A IndoorPet
//Dog IS-A Object

         // refer a dog object as a dog
        // it can do everything a dog can do ( including Animal,IndoorPet stuff)
          Dog d1 = new Dog();
        System.out.println(d1.name);
        d1.speak();
        d1.play();

        Animal a1 = d1;// refer a dog object as an Animal, it can do only those things
          // Animal can do, only the speak method in this case.
        a1.speak();

        // refer a dog object as an Object
        // it can do only those thing object can do
        //for example toString ,hasCode and others
        Object o1 = d1;
//        o1.speak();// hover over the speak method ,it says: "cast qualifier to day54.dog"

        // refer a dog object as a IndoorPet
        //it can only play
        IndoorPet p1 =d1;

    }
}
