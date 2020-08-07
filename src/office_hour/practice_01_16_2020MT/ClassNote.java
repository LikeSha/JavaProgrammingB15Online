package office_hour.practice_01_16_2020MT;

public class ClassNote {

    /**
     * (shortcut PSVM is main method)
     *
     * practice topic: Encapsulation
     *
     * Access-modifiers : public , protected, default, private
     *
     * private: only visible or accessible within the class
     *
     * instance variable : declared within the class, outside any methods & blocks
     *                     belong to the object
     *                     each object they have their own copy of instance variable
     *                     if you creating any variable within the methods or blocks ,it called " local variable"
     *                     not instance variable ,instance variable only created in the instance filed( within the
     *                     class , but outside of any methods and blocks)
     *                     instance variable tight to object ,you need objects to call it , you can not use
     *                     static method to call instance variable ,instance variable belong to object, static
     *                     variable belong to class.
     *
     * constructor : used for creating object
     *               every class MUST have! If we don't create one ,
     *               the compiler will create the default(no-arg) constructor
     *
     *               get executed as soon as we create the object of the class
     *
     *               declaration :
     *                    Access-modifier ClassName(parameter){
     *                        statement;
     *                    }
     *
     * creating object of the class :
     *     by giving new key word to create object ,and give Existing Constructor
     *     you can assign the object you created to a reference name :
     *    ClassName ReferenceName = new ExistingConstructor;
     *
     * Encapsulation: data hiding
     *    1. data has private access modifier
     *    2. grants other classes get access to the private data through getters/setters methods.( if you set this
     *    getters and setters method as private , you get a logical error, so you can only set them as public methods.)
     *
     *    getter(Read Only): instance method
     *                       returns the value of the private data
     *                       return type of the method MUST match with the private data "data type"
     *
     *    setter(Modify) :   instance method
     *                       doesn't not return anything
     *                       the return type of the setter MUST BE VOID!
     *                       passes a parameter. the parameter data type MUST match with the private data "data type"
     *
     *  "this" keyword: refers to object instance
     *         this. :  used to call instance variable and instance methods
     *         we can ONLY use this key word in the place "NON-STATIC"
     *         because this keyword it refers to instance variable ,if you use it in a static method or variable
     *         it will show compiler error, remember static belong to class, instance belong to object.
     *
     *         THE ONLY WAY TO CALL AN INSTANCE VARIABLE IN A STATIC METHOD IS BY CREATING THE OBJECT!! THERE IS NO OTHER WAY.
     *
     *         if the local variable has same variable name with instance variable,then we can use this keyword to call instance
     *
     *
     */
}
