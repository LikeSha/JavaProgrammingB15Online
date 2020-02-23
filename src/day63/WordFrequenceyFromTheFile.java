package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class WordFrequenceyFromTheFile {

    public static void main(String[] args) {

        try{
            List<String> allLines = Files.readAllLines(Paths.get("ok"));
            System.out.println("allLines = " + allLines);

            String allLineAsString = allLines.toString();

            //Map<String,Integer> map = WordUtil.getFrequenceyMap(allLineAsString);
          //  System.out.println("map = " + map);

        } catch (IOException e) {
            System.out.println("ERRORR@@@!!!");
        }


    }

    }

