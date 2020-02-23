package day41_AfterSchoolPractice;

public class Person {

    //private make it only accessible within the same class
    private String name;
    private int age;
    private long ssn;

    public String getName(){
        return name ;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age ;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public long getSsn(){
        return ssn ;
    }
    public void setSsn(long newSsn){
        ssn = newSsn ;
    }

    public void setALL(String newName,int newAge,long newSsn){
        name = newName;
        age = newAge;
        ssn = newSsn;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}

