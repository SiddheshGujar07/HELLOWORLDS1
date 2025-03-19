public class Exception {

    public static void main(String[] args) {


        System.out.println("Start the program");
        String s=args[0];///ArrayIndexOutOfBoundsException///means i enter a string value
        int a=Integer.parseInt(s);///number format exception//means i enter a fload value or special character value.
        int b=100/a;     ///Airthmetic Exception// means i enter 0 value

        System.out.println(b);
        System.out.println("End  the program");


        int f=0;
        int g=10;
        int h=b/a;
        System.out.println(h);///unhecked exception.






    }





}
