import java.util.Scanner;

public class vowels_consonant {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String input= sc.next();///String into convert
        char character=input.charAt(0);///then convert into char

        if(character=='A'||character=='B'||character=='C'||character=='E'|| character=='I'||character=='O'||character=='Z')

        {
            System.out.println("Vowels");
        }

        else
        {
            System.out.println("Consonant");
        }




    }


}
