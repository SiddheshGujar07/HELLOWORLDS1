import java.util.Scanner;

public class Electricity_Bill_Cal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Electricity bill checked");
        System.out.println("No of units checked");
        int units = sc.nextInt();
        if (units < 100) {
            System.out.println("Your electricity bill is :" + units * 0.50 + "rupees");
        } else if (units < 200) {
            System.out.println("Your electricity bill is :" + units * 0.75 + "rupees");
        } else if (units < 300) {
            System.out.println("Your electricity bill is :" + units * 1.20 + "rupees");
        } else if (units > 300) {

            System.out.println("Your electricity bill is :" + units * 1.50 + "rupees");
        }
    }
}





