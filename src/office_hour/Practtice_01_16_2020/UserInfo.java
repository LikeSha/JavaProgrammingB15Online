package office_hour.Practtice_01_16_2020;

public class UserInfo {

    // Attributes ---> instance variables

    private String userName,
           passWord,
           ssn;

    public UserInfo(){           // this is default constructor
        setUserName("Unknown");
        setSsn("000000000");
    }


    public String getUserName(){
        return userName ;
    }

    public void setUserName(String newName){
        userName = newName;
    }

     public String getSsn(){
        return ssn ;
     }

     public void setSsn(String ssn){
        this.ssn = ssn;
     }

     public String getPassWord(){
        return passWord;
     }

     public void setPassWord(String newPassword){
        passWord = newPassword ;
     }

}


