package Oops;

import javax.xml.crypto.dsig.XMLObject;

public class car {

String model;
int year;

car ()
{
    model="xxx";
    year=1935;                 ///default Constructor//
    System.out.println("DC");

}
    car (String model_name,int year_created)
    {
        this.model=model_name;
        this.year=year_created;

    }

    public static void main(String[] args) {

        car c1=new car("I20",2001);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println("------");

        car c2=new car("Ferrari",2021);
        System.out.println(c2.model);
        System.out.println(c2.year);


    }







}
