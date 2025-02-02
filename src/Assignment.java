public class Assignment {


    public static void main(String[] args) {

        

        for(int i=1;i<100;i++)
        {
            if (i%3==0)
            {
                System.out.println("FIZZ");
            } else if (i%5==0)
            {
                System.out.println("BUZZ");
            } else if (i%3==0&& i%3==0)
            {
                System.out.println("FIZZBUZZ");
            }
        }

    }



}
