package day51;

public class ClassNote {

    /**
     * Abstraction :
     *   difference between abstract class and Interface
     *
     *                                   abstract class                             interface
     * instance field                        yes                                       no
     * Static field                          yes                                       yes( only public static final--CONSTANT)
     * Constructor                           yes(any class MUST have constructor)      no
     * Abstract Instance method              yes                                       yes(all methods with no body in interface)
     * Non-abstract method                   yes                                       ONLY non-abstract method is default method
     * Static method                         yes                                       yes(static method with body)
     * Default method                        no!!!                                     yes( only interface have default method)
     * Abstract method access modifier       All expect private : there is no          public (ONLY PUBLIC,if no access modifier
     *                                       private abstract method anywhere          ,it will be automatically public )
     *
     * Instance field access modifier        all!                                      -----
     * Static field access modifier          all !                                     public
     * No-abstract instance method modifier  all !                                     default method should be public
     * static method access modifier         all !                                     public
     *
     * when is good time to use              if we have shared instance fields         A class can implement more than one interfaces
     * Abstract class ?                      we want sub classes to have , if          if you don't have any instance field to share
     *                                       we want to provide reusable constructor   with sub classes and if you want to only share
     *                                       logic to sub class,if you want this class constants. Interface all the implementing
     *                                       to be only super class                    classes have less or no relationship with each
                                                                                       other at all--known as loosely coupled.(plane,
                                                                                       mosqitos, superman..)
     */
}





// abstract class no private abstract method is because its mean to be iherited ,can not have private access modifier