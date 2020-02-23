package office_hour.Practice_01_22_2020MT;

public class ClassNote {
    /**
     * Practice topic  1, method overriding
     *                 2,overriding vs overloading
     *
     *  visibility level of access modifier ;
     *  public > protected > default > private
     *
     *
     *      method overriding : same method name ,same parameter
     *      rules: 1, Must be overridden in sub class ( inherited relation)
     *             2, return-type, method name,parameter MUST be same
     *             3, Overridden Access modifier MUST same or more visible
     *                public > protected > default
     *             4, only instance method can be overridden ( can not be static,
     *                private ,final method)
     *             5,@Override Must be applicable
     *
     *  why you can not overidden private access modifier ?
     *
     *      class car{
     *          start(){
     *              sout("started");
     *          }
     *      }
     *
     *     class Toyota extends car{
     *         start(){
     *             sout("key");
     *         }
     *     }
     *
     *     class Tesla extends car{
     *         start(){
     *             sout("voice Control");
     *         }
     *     }
     *
     *     class Jeep extends car{
     *         start(){
     *             sout("call mechanic");
     *         }
     *     }
     *
     *   why do we need method overriding ?
     *    to provide different implementation(functionality) to the method
     *
     *    method overriding vs method overloading :
     *
     *      method overloading :can happen in same class
     *                          return=type can be different or same
     *                          parameter MUST be different
     *                          any method can be overloaded
     *
     *      method overriding : must happen in sub class only
     *                          return-type must be same
     *                          parameter MUST be same
     *                          access modifier of overridden method MUST be same or
     *                          more visible
     *                          only instance method can be overridden (can not be
     *                          static ,private )
     *
     * assignment(TASK) : create a super class called Bank
     *                    actions: interest rate calculation
     *                    crate sub classes :
     *                    BOA, interest rate ===> 3%
     *                    CapitalOne,        ===> 4%
     *                    Citi              ==> 5%
     *
     *
     *
     *
     */
}


