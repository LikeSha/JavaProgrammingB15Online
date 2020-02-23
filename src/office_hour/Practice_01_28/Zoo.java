package office_hour.Practice_01_28;

public interface Zoo {

    // within the zoom we can control what animal we can have !!!!
    // this is interface
    // zoo is on the top of Animal class , dog ,cat ..all are subclass
    // of Animal class  ZOO is grandfather of them.

    // variable --? public static final ONLY

    public static final String ZOO_NAME = "CYBERZOO";

    // method ---> abstract ONLY

    // you want sleep() inside cat and dog with different body
    public abstract void sleep();

}

