import java.util.Scanner;

public class Maximum_of_Two_Number {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();

        String result= (a>b)?"Maximum Number":"Minimum Number";

        System.out.println("Maximum number is "+result);




    }




}
