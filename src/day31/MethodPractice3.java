package day31;

public class MethodPractice3 {

    public static void main(String[] args) {

        // create a class called MethodPractice3
        // create a method called countDownFrom20tillOne
        // create a method to print odd numbers from 1-100 :  printOddNumbers1t0100()
        // create a method to spell your name : Seda-->> S-e-d-a

        countDownFrom20tillOne();

        printOddNumbers1to100();

        spellName();


    }
      public static void countDownFrom20tillOne(){

          for (int i = 20; i > 0 ; i--) {
              System.out.print(i + " ");
          }
          System.out.println();
      }


         public static void printOddNumbers1to100(){

             for (int i = 0; i <= 100 ; i++) {
                 if(i%2==1){
                     System.out.print(i + " ");
                 }
             }
             System.out.println();
         }


    public static void spellName() {

        String name = "Salik";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (name.charAt(i) != name.charAt(name.length() - 1)) {
                System.out.print("-");

              //  String name = "Salik";
               // String nameStored = "";
                //for (int i = 0; i < name.length() ; i++) {
                 //   nameStored += name.charAt(i)+ "-";
               // }
                //name = nameStored.substring(0, nameStored.length()-1);
               // System.out.println(name)

               // System.out.println('========================================="');

                //for (int i = 0; i <name.length() ; i++) {
                  //  if(i == name.length()-1){
                     //   System.out.println(name.charAt(i));
                   // }else{
                     //   System.out.print(name.charAt(i)+"-");
            }


        }
    }

    }