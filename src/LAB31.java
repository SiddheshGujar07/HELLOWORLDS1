import java.util.Scanner;

public class LAB31 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st numb");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd numb");
        int b = sc.nextInt();

        int resul_sub =sub(a, b);
        System.out.println(resul_sub);
        int resul_add=add(a,b);
        System.out.println(resul_add);
        int resul_multip=mult(a,b);
        System.out.println(resul_multip);
        int resul_div=mult(a,b);
        System.out.println(resul_div);

    }

    static int sub(int a, int b)
        {
            return a - b;

        }
    static int add(int a, int b)
    {
        return a + b;

    }

    static int mult(int a,int b)
    {
        return a*b;
    }

    static int div (int a,int b)
    {
        if(b==0)
        {
            System.out.println("Zero is not allowed");
        }

        return a / b;
    }

    }


