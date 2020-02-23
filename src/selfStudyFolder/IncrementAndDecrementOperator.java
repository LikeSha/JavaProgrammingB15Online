package selfStudyFolder;

public class IncrementAndDecrementOperator {

    public static void main(String[] args) {

        //++
        //--

        int i = 1 ;
        int j = i++ ; // post increment

        System.out.println(i);
        System.out.println(j);

        int a = 1 ;
        int b = ++a ; // pre increment

        System.out.println(a);
        System.out.println(b);

        int m = 2 ;
        int n = m--;// post decrement , firt assign value to n ,then m decreased by 1 --> n=2, m-=2-1=1 ;
        System.out.println(m);
        System.out.println(n);

        int p = 2;
        int q = --p ; // pre decrement
        System.out.println(p);//1
        System.out.println(q);//1

    }
}
