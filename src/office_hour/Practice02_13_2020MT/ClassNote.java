package office_hour.Practice02_13_2020MT;

public class ClassNote {

    /*
    2/13/2020 Practice Topics: Exceptions
                               1. try & catch blocks
                               2. Multi-Catch Blocks
                               3. throws keyword

        Exceptions : unexpected or unwanted events

        two kinds of Exceptions : unchecked exception:means the compiler won't able to check that exception(unexpected)
                                                      only occurs during runtime
                                  All runtime exceptions are unchecked exceptions

                                  checked exceptions; occurs during compile time( unwanted)
                                                      Must be handled immediately!!!

         How many ways we can handle exceptions ? Two ways !
         Exception handlings :
             1. try & catch : blocks used for handling exception.
                              try{
                                  exception code;
                              }catch(Exceptionclass name){
                                statements;
                              }

              How to create custom unchecked exception? by inheriting the RuntimeException class !!!!
              because every class who extend RuntimeException is unchecked Exception!

              How to create custom checked exception?
              By inheriting Exceptions class

              2. throws keyword: throws keyword is used for declaring the method as an Exception.
                  throws keyword MUST be used within method signature. it indicates that the method throws an exception
                  CALLER WILL BE RESPONSIBLE FOR HANDLING THE EXCEPTION

     */
}
