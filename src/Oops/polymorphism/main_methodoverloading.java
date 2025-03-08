package Oops.polymorphism;

public class main_methodoverloading {

    public static void main(String[] args) {

        mathoperation m1=new mathoperation();
        int r1=m1.add(5,7);
        System.out.println(r1);

        int r2= m1.add(5,6,7);
        System.out.println(r2);

        double r3= m1.add(45.7,51.8);
        System.out.println(r3);



    }



}
