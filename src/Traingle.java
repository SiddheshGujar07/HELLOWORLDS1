import java.util.Scanner;

public class Traingle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of side1:");
        int side1=sc.nextInt();

        System.out.println("Enter the length of side2:");
        int side2=sc.nextInt();

        System.out.println("Enter the length of side3:");
        int side3=sc.nextInt();
        if(side1<=0 || side2<=0 ||side3<=0)
        {
            System.out.println("Invalid Triangle sides.");
        }
else {


            if (side1 == side2 && side1 == side2 && side1 == side3) {
                System.out.println("Traingle is Equilateral");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Traingle is Iscolenes");
            } else {
                System.out.println("Traingle is Scalene");
            }
        }

        sc.close();
















    }





}
