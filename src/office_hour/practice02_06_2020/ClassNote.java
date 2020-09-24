package office_hour.practice02_06_2020;

public class ClassNote {

    /*
    02/06/2020 Practice Topic : Polymorphism

    Polymorphism: ability of the object in many forms

   if the super class/super-type is reference to sub class object

       classA extends classB
            sub            super

       for this case : the regular way to create class object is :

        classA             obj     =       new classA();
        reference type     name            object

        classB            obj     =        new classB();
        classB            obj2    =        new classA();<--- Polymorphism concept classB reference child class

   IS-A relationship: Inherited relation

      example: class A extends B
               class Animal{

               }
               class Tiger extends Animal{

               }
               Tiger IS An Animal

   Has-A: instance of the A class is being used by B class
          whenever a class object being used by other class ,
          they have no inheritance relationship, no super sub relationship

          example :

          class Zoo{
              Tiger obj = new Tiger();
          }

          Zoo Has Tiger
     */
}
