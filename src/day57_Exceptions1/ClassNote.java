package day57_Exceptions1;

public class ClassNote {

    /**
     *  OOP : concepts
     *     - Encapsulation
     *     -Inheritance
     *     -Abstraction
     *     -Polymorphism
     *     --------------------------------------------------------
     *     Exception handling In Java
     *
     * Exception--> Exception event , situation
     *
     * In Java , Exceptions are ERRORs that happen during runtime.
     * Lets say you have code with 200 lines , that is running and at line 105 some exception happens.
     *
     * 2 options :
     *  -- you let your code to fail and stop
     *  -- you can handle the exception programmatically
     *  -----------------------------------------
     *
     *
     *
     *                                           JAVA PROGRAM EXECUTION FLOW
     *
     * HelloWorld.java -->                                COMPILER -->                     HelloWorld.class -->         Run
     *                                                      JAVAC
     *
     *   public static void main(String[] args) {         COMPILE ERROR! Missing
     *     System.out.println("Hello World!")               semicolon
     *       }
     *    }
     *
     *  public static void main(String[] args) {         COMPILE ERROR!
     *           system.out.println("Hello World!");      system is unknown !
     *             }                                      System -->S should be uppercase letter
     *          }
     *
     *public static void main(String[] args) {               NO COMPILE ERROR!                                          RUNS SUCCESSFULLY
                System.out.println("Hello World!");
     *                  }
     *               }
     *
     *                                                                                                                      Hello World!
     * public static void main(String[] args) {                     NO COMPILE ERROR!                                       ArrayIndextOutOfBoundException

     *         System.out.println("Hello World");                                                                           invalid index 3
     *         int[] nums = {34,12,5}
     *         System.out.println(nums[3]);
     *         System.out.println("Hello B15!")
     *           }
     *       }
     *
     *
     * public static void main(String[] args) {             NO COMPILE ERROR!                                             Hello World!
     *       System.out.println("Hello World!") ;               Compile successfully                                      StringIndexOutOfBoundsExceptions
     *           String str = "java";
     *           System.out.println(str.charAt(10));
     *           System.out.printlin("Hello B15!");
     *       }
     *     }
     *
     *Program runs line by line , when line reaches where we are reading from invalid index ,it will THROW EXCEPTION
     * and execution stops. The remaining statements will no run .
     *
     *
     * java program writing and execution process :
     * We write our java code and save it with .java extension.
     * HelloWorld.java-->Compiler-->HelloWorld.class--Run
     *
     * As we see in the flow, it needs to be compiled first then executed.So Compiler will check everything :
     * syntax,data types matching( int n = "java")
     * etc before completing compilation process. If compiler sees something is wrong ,we will see COMPILE ERROR.
     *
     * COMPILE ERROR --> happens during compile process, and it is due to programmer's mistake.We need to fix them for our program
     * to be able successfully run.
     *
     * Program runs line by line ,when line reaches where we are reading from invalid index, it will THROW EXCEPTION
     * and execution stops. The remaining statements will not run .
     *
     * When your code is running ,it will run top to bottom line by line, when java sees a line that has error, it will THROW EXCEPTION
     * . RUNTIME EXCEPTION.
     *
     * COMPILE ERROR--error during compile process
     *
     * Exception --error during running process
     *
     * Since Java is object oriented language ,even Exceptions are also OBJECTS that are created .
     *
     * For each Exception type in java , there is a Class. Whenever error happens during runtime ,
     * object is crated from a matching class.
     *
     * for example : if your code is reading from invalid index , then object from ArrayIndexOutOfBoundsException class is created
     * and THROWN.
     *
     * Runtime Exceptions stop the normal execution of the program
     *
     * Create package day 57_exceptions
     * Class ExceptionExample
     *
     *
     */
}
