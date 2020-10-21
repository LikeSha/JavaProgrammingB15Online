package day60;

public class ClassNote {

/**
 * Exception :
 *    abnormal or non-typical event
 *    to cause alteration of program flow
 *
 *    When exception occur in the program, an specific type of exception object that contains information
 *    will be created and thrown according to what happen and thrown to runtime system.
 *
 *    9/0 --> new ArithmeticException ( some message)
 *    How do I throw it ?
 *    throw new ArithmeticException(some message) this is what happened behind the screen.
 *
 *    Exceptions are object just like everything else in Java
 *
 *    "abc".charAt(100)--> throw new StringIndexOutOfBoundsException(...)
 *
 *    Since exceptions are objects, It has its own class to be the blue print for the exception
 *
 *    Exceptions are categorized by INHERITANCE RELATIONSHIP
 *      Exception Hierachy:
 *                                 Throwable
 *
 *               Error                                   Exception
 *
 *                                    RuntimeException                       Everything else
 *
 *     RuntimeException is sub class of Exception class
 *     Anything IS-A RuntimeException is regarded as Unchecked Exception
 *     We are not forced to handle the exception at compile time.
 *     Usually happen due to incorrect usage of the method or library
 *     for example : passing incorrect index for charAt method
 *     The spoiled ones that we do not have to handle
 *
 *     Any Sub class of the Exception class other than RuntimeException is regarded as Checked Exception and we
 *     MUST (are forced to) handle or declare at compile time
 *
 *     Most of the time File related actions are checked exception
 *     for example : IOException, FileNotFoundException and so on
 *
 *     Whats the easiest way if I do not want to google to know its checked or Unchecked Exception ?
 *     Just try to throw it using throw keyword, if compiler complains, it means its checked Exception
 *     if not ,then it is unchecked Exception.
 *
 * Scenario 1::
 * If I ask you tell me your state so I can store :
 *
 *   first I did not care about duplicates
 *   I would just created List and keep adding all your state into it
 *
 *
 * Scenario 2:
 *   then I realize there are many students from same states , and I want to only store the unique states you are from
 *
 * So I need some kind of data structure already does it for me
 * So I don't have to use bunch of if statements to handle it
 *
 *    Set interface is a data structure for unique element
 *
 * Scenario 3:
 *   now I want to actually store the student-state pair
 *   so I can get the state by student name
 *   Michael : Virginia
 *
 *   Map interface
 *
 *  Scenario 4:
 *   I want to answer the questions I got from the students
 *   but I want to answer them in the order I received
 *   so First come first serve based !!
 *
 *   Queue interface
 *
 */
}
