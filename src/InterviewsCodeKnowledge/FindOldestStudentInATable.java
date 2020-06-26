package InterviewsCodeKnowledge;

public class FindOldestStudentInATable {

    public static void main(String[] args) {

        String[][] students ={
                {"1" , "John" ,"35","USA"},
                {"2" , "Kevin" ,"40","Brazil"},
                {"3" ,"Scott" ,"20","Canada"}
        };

        // Find oldest student and print his name
        // 1st print only ages values

        String oldestPersonName = students[0][1];// lets infer 1st person is oldest
        int ageOfOldestPerson = Integer.parseInt(students[0][2]);// lets infer that 1st person is the oldest one
        for(String[] row : students){
            // go through every row and get value only from 3rd column//index = number-1
            System.out.println(row[2]);//// 3rd column represents age
            //I need to convert into integer to be able to compare
            int age = Integer.parseInt(row[2]);// convert string -->into int

            if(age>ageOfOldestPerson){
                // then we have new max age and new oldest name
                ageOfOldestPerson = Integer.parseInt(row[2]);
                oldestPersonName =row[1];
            }

        }

        System.out.println("Oldest Person Name is  : " + oldestPersonName);

    }
}
