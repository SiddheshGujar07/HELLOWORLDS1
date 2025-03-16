package Enum;

public class real_exaomple_enum1 {

    public static void main(String[] args) {

        System.out.println(URL.restassured);
        if(URL.katalon.equals("katalon"))
        {
            System.out.println("I want to do something");
        }
        else {
            System.out.println("False");
        }



    }




}

enum URL{
    google,restassured,katalon;

}
