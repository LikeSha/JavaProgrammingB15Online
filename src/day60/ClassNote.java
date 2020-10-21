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
 *     ------ MOST IMPORTANTLY Someone has to handle the exception object that created during the program run.
 *
 *             try catch
 *             try catch catch catch
 *             try catch ........finally
 *
 *             try{
 *
 *                 cliffDiving();
 *                 gettingTheSleepingKidFromTheCar();
 *
 *             }catch(DiveTooDeepException e){
 *
 *                   hang on to the wire, told you so
 *
 *             }catch(CryingOutOfBoundException e){
 *                   You cry too,ignore, pick the kid up,try to calm down,rock him to sleep again
 *             }
 *
 *             }catch(Exception e){
 *
 *                 if anything else happen, come here!!
 *
 *             }finally{
 *                 // no matter exception happen or caught or not happen at all
 *                 // this is the place that always run
 *             }
 *
 *  ----------------------- throw VS throws  ------------------------------------------------------
 *
 *  throws keyword is used to document a method might throw that type of exception
 *
 *  public static void playWithFire throws GetBurnedException{
 *
 *      // some code here
 *      //IS IT REQUIRED TO HAVE EXCEPTION OBJECT ACTUALLY GENERATED HERE ?
 *      //NO ~! IT MIGHT HAPPEN OR IT MIGHT NOT HAPPEN, ANYONE WHO USE THIS CODE ,ASSUME THE WORST IS EXCEPTION HAPPEN,
 *      //BUT IT IS NOT NECESSARY HAPPEN . IF IT HAPPEN ,HANDLE IT !
 *
 *  }
 *  this is the only place you will see throws keyword
 *  in (any) method declaration and is not used anywhere else.
 *  We will not use new keyword after throws
 *  Since throws are used to document it might throw an exception , can I DOCUMENT MORE THAN ONE TYPE? YES YOU CAN
 *  for example as below code:
 *
 * //assuming these exceptions actually exists
 *  public void skyDiving() throws DiveTooDeepException,TooScaredException,ParachuteNotWorkingException{
 *
 *
 *  }
 *
 *
 *
 *
 *  throw keyword is used to actually programmatically throw the exception to the runtime system
 *  just like actually breaking the glass rather than telling it might break
 *  for example : throw new AnyTypeOfException( optional message here)
 *
 *  What can you throw ????????????????
 *  ANYTHING IS-A Throwable, any object created from Throwable class or Sub class of Throwable class
 *  even the Error ( DO NOT TRY AT HOME!!)
 *
 *  -----------------------How to create custom Exception ?------------------------
 *
 *
 *
 *
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
