package day11;

public class LogicalOperator_SinglePipe {

    public static void main(String[] args) {




       // | on the other hand will keep checking the rest of the condition
       // for example :
        // you have 5 stores you can buy milk from
        //you check the store one by one
        // do you have milk in store 1 : if yes get it and stop checking the rest of the store
        //that's exactly what double (2) pip || do , it stop as long as it sees one
        // | single pipe will check each and every store even you already got your milk

        System.out.println(10 > 5 || 9 / 0 == 3);
        System.out.println(10 > 5 | 9 / 0 == 3);





    }
}
