package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("C:\\Users\\Owner\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\employeeDta.txt"));

        Map<Integer,String> idNamePair = new HashMap<>();

        for(String eachLine : allData){
            // cutting the String into two part and parsing first part to number
            //saving second part to name
            int id = Integer.parseInt(eachLine.split(",")[0]);
            String name = eachLine.split(",")[1];
//            System.out.println("id = " + id);
//            System.out.println("name = " + name);

            // adding the data into the map
            idNamePair.put(id,name);
        }
        System.out.println("idNamePair = " + idNamePair);
        // get the person with employee id with number 20
        System.out.println("idNamePair.get(20) = " + idNamePair.get(20));





        //1,Lilian---1    Lilian
//        String line = "1,Lilian" ;
//        int id = Integer.parseInt(line.split(",")[0]);
//        String name = line.split(",")[1];
//
//
//        Map<Integer,String> idNamePair = new HashMap<>();
//        idNamePair.put(id,name);
//        System.out.println("idNamePair = " + idNamePair);
//
//
//
//          allData.forEach(eachLine-> System.out.println("eachLine = " + eachLine));

        /*TASK :
         Create a List of String with your group member names
         then create a map of String ,Integer called nameCharCountPair
         and store the name and character count of each member

         */




    }
}
