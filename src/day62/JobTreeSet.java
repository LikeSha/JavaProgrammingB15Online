package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        // We want the jobs automatically sorted by natural order ( salary)
        // while we are adding them into the Collection object
        // so we chose SortedSet for this .


        // Create a SortedSet of Job(from day 61 ) with TreeSet implementation
        // add 5 jobs and print them out vertically and see wha you get

        SortedSet<Job> myJob = new TreeSet<>();
        myJob.add(new Job("FL",120000,"AT&T"));
        myJob.add(new Job("LA",130000,"BBC"));
        myJob.add(new Job("TX",150000,"APPLE"));
        myJob.add(new Job("CA",100000,"AMAZON"));
        myJob.add(new Job("VA",110000,"USPTO"));


      for( Job each : myJob){

          System.out.println("each = " + each);

      }

       // How does HashSet decide 5 Person object (name ,age) are duplicate or not

    }
}
