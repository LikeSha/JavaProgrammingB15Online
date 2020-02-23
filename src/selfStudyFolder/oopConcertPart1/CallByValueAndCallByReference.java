package selfStudyFolder.oopConcertPart1;

public class CallByValueAndCallByReference {

    int p;
    int q;

    public static void main(String[] args) {

        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int x = 10;
        int y = 20;
        obj.testSum(x,y); // call by value OR pass by value
        //obj.testSum(10,20);

        obj.p = 50;
        obj.q = 60;

        obj.swap(obj);
        // after swap
        System.out.println("obj.p = " + obj.p);
        System.out.println("obj.q = " + obj.q);
    }

    public int testSum(int a,int b){
        a = 30;
        b = 40;
        int c = a + b;
        return c;
    }

    // call by reference
    // INTERVIEW QUESTION : IS IT POSSIBLE CALL BY REFERENCE IN JAVA ? ANSWER : YES !!!
    // BY USING OBJECT REFERENCES !!  (WE ARE PASSING OBJECT REFERENCE)
    // WHAT IS CALL BY VALUE ? WHAT IS CALL BY REFERENCE ?
    public void swap(CallByValueAndCallByReference t){
        int temp;
        temp = t.p;// temp = 50;
        t.p = t.q ; // t.p = 60;
        t.q = temp; // t.q = 50;
    }

}
