package Exception;

public class Lab01 {

    public static void main(String[] args) {

        try {
            String ip=args[0];///Array index bound exception.
            int a=0;
            a=Integer.parseInt(ip);
        } catch (NumberFormatException |ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }










}
