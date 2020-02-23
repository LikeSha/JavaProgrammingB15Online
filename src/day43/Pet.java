package day43;

public class Pet {

    /**
     * Attribute : type,name  encapsulate your fields
     * behaviours : getters , setters, toString
     * constructor : no arg constructor, set the type "unknown"
     * set the name " noname"
     * 2 args constructor
     * set the name and breed to what the caller passed
     * speak, void method with no arg
     * accept no parameter
     * according to the type speak following
     * cat-->>meow
     * dog-->woof
     * cow-->mooo
     * horse-->neinei
     * <p>
     * // Create another class called PetStore with main method
     * create 8 pet objects with initial value
     * store them into a List<Pet>
     * 1, print out all info
     * 2,print out only name
     * 3,print out only cats
     */

    private String type;
    private String name;

    public Pet() {
        this.type = "unknown";
        this.name = "no-name";
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void speak() {

        //switch (type.toLowerCase()  ){
        switch (type) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "horse":
                System.out.println("NEIGH");
                break;
            case "cow":
                System.out.println("MOOO");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL!");

        }

    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // IF YOUR METHOD DOES NOT READ OR MODIFY OBJECT ATTRIBUTE
    // YOU CAN JUST MAKE IT STATIC
    public static void showGeneralPetInfo(){
        System.out.println("PETS ARE FRIENDS FOR HUMAN");
        //THIS WILL NOT WORK
        //STATIC METHOD CAN NOT ACCESS ANYTHING NON-STATIC
        //System.out.println(name);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}