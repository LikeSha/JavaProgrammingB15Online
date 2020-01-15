package Practice_01_15_2020;

public class Teacher {

    private String name ;
    private int age;

    // bad idea to have main method here , lets do it anyway
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
//        t1.setName("Sventlana");
//        t1.setAge(19);
        t1.initializedFields("Nuran",18);

        System.out.println("t1.getAge() = " + t1.getAge());
        System.out.println("t1.getName() = " + t1.getName());

    }
    public String getName(){
        return name ;
    }

    public void setName(String name){
        //what if setting the name require 100 lines of check? you can add right here
        this.name = name ;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
       // what if setting the age require 100 lines of check? you can add right here
        this.age = age;
    }

     // a method to set both age and name
    public void initializedFields(String name, int age){

        //this.name = name;
        //this.age = age;
        // what if setting the name require 100 lines of check
        //what if setting the age require 100 lines of check
        // can I just reuse the method I already have for setting name and age
        setName(name);
        setAge(age);
    }

}
