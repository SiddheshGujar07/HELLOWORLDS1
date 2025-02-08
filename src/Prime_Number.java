public class Prime_Number {

    public static void main(String[] args) {

        int n=5;

        for (int i=1;i<=n;i++)
        {
            if (n%i==0)

            {
                System.out.println("Not a Prime Number");
            }

          else
          {
              System.out.println("Prime number");
            }
        }

    }


}
