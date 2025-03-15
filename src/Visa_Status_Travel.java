import java.util.Scanner;

public class Visa_Status_Travel {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Visa status is valid/invalid");
        String status= sc.nextLine();

        if (age>=18 )
        {
            System.out.println("Visa is valid and person will travel");
        } else if (age<18)
        {
            System.out.println("Visa is invalid and Sorry you cannot travel");
        }
        else if (status.equalsIgnoreCase("invalid"))
        {
            System.out.println("u cannot travel");
        }

    }







}
