package Exception;

import java.util.Scanner;

public class try_catch_finally
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally
        {
            System.out.println("CLOSE");
            sc.close();
        }


    }



}
