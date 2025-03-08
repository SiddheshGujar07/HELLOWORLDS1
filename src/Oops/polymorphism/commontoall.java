package Oops.polymorphism;

public class commontoall {

void openbrowser()
{
    System.out.println("Open the browser in 10 sec");
}

}

class tc1 extends commontoall{
    void starttc()
    {

        openbrowser();
    }

}
class tc2 extends commontoall


    {
       @Override
        void openbrowser()
        {
            System.out.println("Open the browser in 5sec");

        }


    }


