package day43;

public class PetStaticPractice {

    public static void main(String[] args) {

       //String str = String .valueOf(10);
        Pet.showGeneralPetInfo();

        // DOES NOT WORK
        //Pet.getName();  non-static method "getName()" cannot be referenced from a static context
        // when we call static method ,we use static way ! what is static way ? it is : class name.method name
        // in this case ,class name is Pet, method name is showGeneralPetInfo() , so the static way is :
        // Pet.showGeneralPetInfo();


        Pet p1 = new Pet("cat","yumyum");
        System.out.println("p1 Name = " + p1.getName());
        p1.speak();

    }
}
