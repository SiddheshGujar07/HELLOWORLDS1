import java.util.Scanner;

public class LAB16 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();///java.inputmissmatch exception
        if (age>18)
        {
            System.out.println("You are voted");
        }
        else
        {
            System.out.println("Not alllowed");
        }



    }




}
