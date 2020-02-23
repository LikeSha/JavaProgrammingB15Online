package group5mentor;

public class Day4_Jan27_2020 {

    /**
       Interview question  what is difference between instance variable and static variable ?  method ?

     // when do you implement encapsulation ?  for example : when I work in ... I need to get all patients data , in order to
      // keep all patience info, I have to make it private to secure the personal data, and provide getters and setters ,
      // getters to get the info I need ,setters to set the value of those data .

     1,Java Can you run code without main method ? YES !  you can run the class without main method

     2, Why do you think the main method in a class is static ?
     3, do you know the difference between static method and non static method ?
     answer : static method does not need a object or variable  , we can use it easily.
     for instance method ( non static method ) you need an object  , when overridding ,
     you can only override static method .

     4, what is static block ?
     5,what is constructor ? exp:  I have class name is car ,in this class of car ,it has a lot of methods ,methods stands for behaviors,
     suppose your method name is " startUpEngine" ,whenever you call this class ,you want the car turn on engine by itself,
     what does constructor do is :  constructor actually is kind of container , once you call the object TOYOTA (EXAMPLE) ,the method
     will turn the engine one , the constructor will run the method and make the car engine one .( means, constructor run with
     object together )

     6, what is different access modifier of JAVA ? public ---default--protected ---private
     7, can you give me the difference between Array and ArrayList ?
     They are coming from different resources ,array coming from java collections, arrayList from wrapper class ;
     they have different methods to implement :  array.lane, arrayList.size ;
     in terms of size : array is fixed size ; arrayList is resizable
     array can only contain primitive data type , can not contain objectsarrayList can store objects...
     remember the name of the methods is different this is good enough

     8 can you tell me difference between object and class ?
     object can not be extended , class can be
     object is created many times as for requirement , class can only create once ;
     Object − Objects have states and behaviors. ... An object is an instance of a class.
     Class − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.

     9, what the difference between for loop and for each loop ?
     for each loop don't need Integer variable ,for loop need it .
     The major difference between the for and foreach loop in c# we understand by its working:
     The for loop: The for loop's variable always be integer only.
     The For Loop executes the statement or block of statements repeatedly until specified expression evaluates to false.

     -----------------------------------------------------------------------------------------------------------------------------
     1.   What are the various access specifiers in Java?
     In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable.
     In Java, there are four access specifiers given below.
     Public The classes, methods, or variables which are defined as public, can be accessed by any class or method.
     Protected Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.
     Default Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
     Private The private class, methods, or variables defined as private can be accessed within the class only.

     1.   Array vs ArrayList
     Array is a part of core Java programming and has special syntax.
     ArrayList is part of collection framework and implement List interface.
     • Major difference is that; Array is a fixed length data structure,
     so we can change length of Array one created, ArrayList is re-sizeable.
     • The other major one is that Array can contain both primitives and objects.
     ArrayList can only contain objects. It cannot contain primitive types.
     • Also, we can compare Array and ArrayList on how to calculate length of Array or size of ArrayList.
     We use length for an Array, we use size() method for an ArrayList.
     6:38
     1.   Object vs Class
     Class is a blueprint or template which you can create as many objects as you like.
     Object is a member or instance of a class
     Class is declared using class key word, Object is created through newkeyword mainly.
     A class is a template for objects. A class defines object properties including a valid
     range of values, and a default value. A class also describes object behavior. An object is
     a member or an “instance” of a class and has states and behaviors in which all of its
     properties have values that you either explicitly define or that are defined by default
     settings.
     Class can be defined as a template/blueprint that describes the behavior/state that the
     6:39
     1.   Object vs Class
     Class is a blueprint or template which you can create as many objects as you like.
     Object is a member or instance of a class
     Class is declared using class key word, Object is created through newkeyword mainly.
     A class is a template for objects. A class defines object properties including a valid
     range of values, and a default value. A class also describes object behavior. An object is
     a member or an “instance” of a class and has states and behaviors in which all of its
     properties have values that you either explicitly define or that are defined by default
     settings.
     Class can be defined as a template/blueprint that describes the behavior/state that the
     object of its type support.
     If we compare them there are many differences but let me tell you the important ones
     to know;
     There are many ways to create object in java such as new keyword, newInstance()
     method, clone() method, factory method and deserialization. There is only one way to
     define class in java using class keyword.
     Object is created many times as per requirement. Class is declared once.
     Object is an instance of a class. Class is a blueprint or template from which objects are
     created.
     Object is a physical entity. Class is a logical entity.

     1.   What is the constructor?
     a.   A constructor in Java is a special method that is used to initialize objects.
     The constructor is called when an object of a class is created.
     b.   Each time an object is created using new() keyword at least one constructor
     (it could be default constructor) is invoked to assign initial values to the data members of the same class.
     6:40
     1.   What is Iterator and difference between for each loop?
     Iterator works with ArrayList and not array.
     It will help us Iterate through the elements.
     Difference is with iterator you can make changes(remove item) to the list while iterating.
     within for each loop we cannot make changes to our list




     **/
}
