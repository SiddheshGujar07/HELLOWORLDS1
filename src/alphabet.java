import java.util.Scanner;

public class alphabet {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);

        if (ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z' ) //Upper case and lower case

        {
            System.out.println("System accept Character");
        }
        else
        {
            System.out.println("System does not accept character");
        }




    }











}
