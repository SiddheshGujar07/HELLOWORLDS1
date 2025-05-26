import java.util.Scanner;

public class CI_Scanner1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
         String Name=sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter your salary");
        double salary= sc.nextDouble();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the value1");
        int value1=sc1.nextInt();
        System.out.println("Enter the value2");
        int value2=sc1.nextInt();

        String maximum=(value1>value2)?"Maximum":"Minimum";

        System.out.println(maximum);













    }









}
