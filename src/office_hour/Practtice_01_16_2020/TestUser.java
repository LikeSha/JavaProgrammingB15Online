package office_hour.Practtice_01_16_2020;

public class TestUser {

    public static void main(String[] args) {

        //  ClassName ReferenceName = new   ExistingConstructor;
        TestUser t = new TestUser();

        UserInfo Alisa = new UserInfo() ; // to call the instance of the class


        //System.out.println(Alisa.userName); private is not accessible
        Alisa.setUserName("Alisa");
        System.out.println(Alisa.getUserName());//

        Alisa.setSsn("123456");
        System.out.println(Alisa.getSsn());

        UserInfo kamran = new UserInfo();
        System.out.println(kamran.getUserName());
        System.out.println(kamran.getSsn());





    }
}
