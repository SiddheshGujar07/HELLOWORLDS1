import java.util.Scanner;

public class VOTE {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age ");
        int age= sc.nextInt();

        String result= (age>18)?"You can vote":"You cannot vote";

        System.out.println(result);



    }





}
