package selfStudyFolder;

public class FindHigestNumber {

    public static void main(String[] args) {

        int a = 100 ;
        int b = 200 ;
        int c = 300 ;

        // logic : use nested if-else
        if(a>b && a>c){
            System.out.println("a is the greatest");
        }else if( b> c){
            System.out.println( "b is the greatest");
        }else{
            System.out.println("c is the greatest");
        }

    }
}
