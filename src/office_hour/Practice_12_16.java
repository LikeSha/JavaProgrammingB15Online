package office_hour;

public class Practice_12_16 {

    public static void main(String[] args) {

    // list , map ,linklist ,q...most of structure simpler than multi dimensional
        // SQL is a language data base
        String[] names = {"John" , "Kevin" ,"Scott"} ;
        System.out.println("First name is " + names[0]);

        for(String name : names){
            System.out.println(name);

        }
         // apache poi Library  ( read/write data from excel with java)
        // if you need age of 3rd student   student[2][2]
          // lets say we need to store some table
        //where we have rows and columns

        String[][] students ={
                {"1" , "John" ,"35","USA"},
                {"2" , "Kevin" ,"40","Brazil"},
                {"3" ,"Scott" ,"20","Canada"}
        };
        // to format your code
        //click option + command + L
        System.out.println("How many arrays inside students 2d array ? " + students.length);
        System.out.println("How many values in second row (inner array ? " + students[1].length);

        for(String[] arr : students){
            // loop through values in every inner array
            for(String value : arr){
                System.out.println(value + " ");
            }
            System.out.println();
        }
//        /// Find oldest student and print his name
        //for
 //
//
 //         /// Find oldest student and print his name
       // 1st print only ages values
        String oldestPersonName = students[0][1]; // lets inger 1st person is oldest
        int ageOfOldestPerson = Integer.parseInt(students[0][2]); // lets infer that 1st person is the oldest one
        for(String[] row : students){
            // go through every row and get value only from 3rd column//index = number-1
            System.out.println(row[2]); // 3rd row represents age
            int age = Integer.parseInt(row[2]) ;// convert string ---> into int
            // if age is higher than previous max
            if(age > ageOfOldestPerson){
                // then we have new max age and new oldest name
                ageOfOldestPerson = Integer.parseInt(row[2]) ;
                oldestPersonName = row[1] ;
            }
        }
        System.out.println("ageOfOldestPerson = " + oldestPersonName);
    }
}
