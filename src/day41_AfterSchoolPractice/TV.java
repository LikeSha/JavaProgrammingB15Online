package day41_AfterSchoolPractice;

public class TV {

    String name ;
    boolean isOn ;
    int currentChannel;


    public int getCurrentChannel(){
        return currentChannel ;
    }

    public void setCurrentChannel( int newChannel){
        if(newChannel <0 || newChannel>50){
            System.out.println("Invalid channel, getting out");
            return; // early exit from the method
        }

        if(isOn==true){
            currentChannel = newChannel;
        }else{
            System.out.println("TRUN ON THE TV FIRST");
        }

    }



    public void turnOn(){
        if(isOn ==false){// checking for equality
            System.out.println("Turning on TV");
            isOn = true ;// assigning the value of isOn to true
        }

    }
    public void trunOff(){
        if(isOn ==true){
            System.out.println("Truning off TV");
            isOn = false;
        }

    }


    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
