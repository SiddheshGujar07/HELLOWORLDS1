import java.util.Scanner;

public class Bonus_Salary {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary= sc.nextInt();
        System.out.println("Enter your year");
        int year= sc.nextInt();

        if (year<1)
        {
            System.out.println("YOE is less than 1 yr :"+salary * 111+  "No bonus");
        }
        else if (year>1 && year<3)

        {
            System.out.println("YOE is between 1 to 3 yr :"+salary * 5+ "5 % bonus");
        }

        else if (year>4 && year<6)

        {
            System.out.println("YOE is between 4 to 6 yr :"+salary * 0.1+":10 % bonus");
        }
        else if (year>6)

        {
            System.out.println("YOE more than 6 yr :"+salary * 0.15+  "15% bonus");
        }



    }







}
