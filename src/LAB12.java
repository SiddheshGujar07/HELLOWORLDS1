public class LAB12 {

//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

    public static void main(String[] args) {

     int a=Integer.parseInt(args[0]);//Convert into integer
     int b=Integer.parseInt(args[1]);//Convert into integer

     String result=a>b?"Yess":"No";///Ternary Operator
        System.out.println(result);


    }




}
