package Oops.polymorphism;

public class main_methodovveriding {

    public static void main(String[] args) {

        son s1=new son();
        s1.home();

        Father f1=new Father();
        f1.home();

        Father f3=new son(); //Dynamic dispatch//
        f3.home();//method overriding//means we are updating the existing feature




    }







}
