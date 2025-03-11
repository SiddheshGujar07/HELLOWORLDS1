package Oops.Encapsulation;

public class Class_E1 {

private String username;
private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isadmin) {
        if (isadmin)
        {
            this.password = password;
        }
        else {
            System.out.println("Not allowed");

        }


    }


    public Class_E1(String pwd, String usr) {
        this.password = pwd;
        this.username = usr;

    }

    public static void main(String[] args) {
             boolean isadmin=true;
            Class_E1 vwologin=new Class_E1("123","Siddhesh123");
            vwologin.setPassword("567",false);
        System.out.println(vwologin.password);
        System.out.println(vwologin.username);
        System.out.println(vwologin.password);








    }












}
