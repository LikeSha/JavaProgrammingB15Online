package office_hour.Practice02_13_2020MT;

public class TestCustomClass {

    public static void main(String[] args) throws NoBreakTimeException {

      boolean studentAskForBreak = false;

      if(studentAskForBreak){
          throw new NoBreakTimeException(); // unchecked exception
      }else{
          System.out.println("Continue");
      }


    }

    public static void method1() throws NoBreakTimeException{

    }
}
