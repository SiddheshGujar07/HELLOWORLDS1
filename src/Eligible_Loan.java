import java.util.Scanner;

public class Eligible_Loan {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        // Age Validation:
        //
        //              :- Check if the age is a positive integer.
        //
        //              :- Ensure the age is at least 18 years old.
        //
        //              :- Max age can be 80.
        int age = sc.nextInt();
        if (age > 0)
        {
            System.out.println("Age is a positive integer");
        }
        else if (age<0)
        {
            System.out.println("Negative number");

        }

        for (int i = 18; i <= 80; i++)
        {

            System.out.println("Age lies between 18 to 80");
        }

        System.out.println("Enter your salary");
        //Salary Validation:
        //
        //       :- Check if the salary is a positive number.
        //
        //       :- Define a minimum salary threshold (e.g., 30,000).
        double salary=sc.nextDouble();
        if (salary>0)
        {
            System.out.println("Salary is a positive number");
        } else

        {
            System.out.println("Salary is a negative number");
        }
        if (salary<=30000)

        {
            System.out.println("Minimum salary is 30k");
        }
        else
        {
            System.out.println("Maximum salary greater than 30k");
        }

        //Credit Score Validation:
        //
        //             :- Check if the credit score is a positive integer.
        //
        //             :- Define a minimum credit score threshold (e.g., 650).
        //
        //             :- Max credit score threshold (e.g., 850).

        System.out.println("Enter you credit score");
        int credit_score= sc.nextInt();

        final int MIN_CREDIT_SCORE = 650;
        final int MAX_CREDIT_SCORE = 850;


        if (credit_score>0)
        {
            if (credit_score >= MIN_CREDIT_SCORE && credit_score <= MAX_CREDIT_SCORE)
            {
                System.out.println("Credit score is a valid");
            }
        }
        else
        {
            System.out.println("Credit Score is a not valid ");
        }







    }







    }








