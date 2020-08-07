package office_hour.practice_01_16_2020MT;

public class UserInfo {

    // Attributes ==> instance variables   (shortcut PSVM is main method)

    private String userName,
                   passWord,
                   ssn;

    public UserInfo(){              // after we created getters and setters ,now we create constructor, inside the block
        setUserName("Unknown");    // we can just call our setter() method , in this case we set the username is unknown
        setSsn("000000000");      // and we set the ssn is 000000000
        setPassWord("123456");
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String newName){
        this.userName = newName;
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
}
