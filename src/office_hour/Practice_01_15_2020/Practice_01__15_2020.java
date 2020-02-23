package office_hour.Practice_01_15_2020;

public class Practice_01__15_2020 {

    /**
     * class and object
     * class is a template for object
     * it can define what kind of attribute and behaviour an object should have
     *
     * attribute : -->> instance variable|filed
     * behaviour :-->> instance methods
     *
     * object is the actual thing created out of this template and any object created out of
     * same template will have the attribute and behaviours defined in the template
     *
     * Protecting the data|attribute of the object , we can encapsulate the instance field by making
     * it private and provide public getters and setters
     *
     * we have 4 access modifier : public , protected ,default and private ( ignore protected for now
     * until inheritance topic comes in )  this is always being asked in interview about
     * access modifier topic
     *
     * public --->accessible anywhere
     * default -->> no access modifier
     *        --->> only within the package , also known as package private
     * private -->> only accessible within the same class
     *
     * outside of the class when we create object we can give an object any name we want , like p1,p2 or
     * any other names
     *
     * if we want to refer the object in the template itself , we can use the keyword " this " -->
     * the current object we are working on
     *
     * so outside the template it would look like this ;
     * Person p1 = new Person();
     * p1.age = 18 ;
     *
     * inside your template it would look like :
     * this.age-->> to point to the instance field age
     * this.name-->> to point to the instance field name
     * this.eat(); // optional, usually it will just work without
     */

//      public class Person{
//
//          private int age;
//          private String name;  // private key work means we encapsulate it
//
//       public int getAge(){
//
//        return age ;
//
//     }
//       public void setAge(int age){
//           you have potion here to add bunch of validation or code
//           to make sure we don't have invalid age here
//           this.age= age
//       }
//
//      public String getName(){
//             return name; // return this.name
//      }
//      public void setName(String name){
//            this.name = name ;
//      }
//          public void eat(){
//              print(name+"eating");
//          }
//    }
//

}
