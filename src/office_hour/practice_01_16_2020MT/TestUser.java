package office_hour.practice_01_16_2020MT;

public class TestUser {
    int a ;  // in you do System.out.println(a) inside the main method, it not works
            // because int a is instance variable , it tight to object , you need to create objects to call it,
           // main method is static method and belong to class, static method DOES NOT ACCESS TO INSTANCE VARIABLES

    // creating object of the class :
    // ClassName ReferenceName = new ExistingConstructor;
    public static void main(String[] args) {

              TestUser t = new TestUser();
              // if you call int a this way, it works :
//        System.out.println(t.a);

        UserInfo Alisa = new UserInfo();// to call the instance of the class
//        System.out.println(Alisa.userName);// private is not accessible outside class!!
         // you must provide getter(Read only)

        System.out.println(Alisa.getUserName()); // when you print out this , it shows " null" because
        // you didn't initialize the userName yet , therefore , you need to apply for setter() method to initialize
        //userName first ,then you can print out
        Alisa.setUserName("Alisa");
        System.out.println(Alisa.getUserName());

        Alisa.setSsn("123456");
        System.out.println(Alisa.getSsn());

        UserInfo Kamran = new UserInfo();
//        System.out.println(Kamran.getUserName()); // get result null because you never initialize it yet
//        System.out.println(Kamran.getSsn()); // get result null because you never initialize it yet

        //  // after we created getters and setters ,now we create constructor, inside the block
        // we can just call our setter() method , in this case we set the username is unknown
        // and we set the ssn is 000000000
        // and now if I do the above 3 lines of code again ,it wil show Kamran name is Unknown and ssn is 000000000
        // this is how the constructor works!
        System.out.println(Kamran.getUserName());
        System.out.println(Kamran.getSsn());

        //THE ONLY WAY TO CALL AN INSTANCE VARIABLE IN A STATIC METHOD IS BY CREATING THE OBJECT!! THERE IS NO OTHER WAY.
        //THE ONLY WAY TO CALL AN INSTANCE VARIABLE IN A STATIC METHOD IS BY CREATING THE OBJECT!! THERE IS NO OTHER WAY.
        //THE ONLY WAY TO CALL AN INSTANCE VARIABLE IN A STATIC METHOD IS BY CREATING THE OBJECT!! THERE IS NO OTHER WAY.


    }
}
