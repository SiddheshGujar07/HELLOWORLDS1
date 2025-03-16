package Oops.Abstraction;

public class Interface_Scenario {

    public static void main(String[] args) {
        P p=new P();
        p.icm1();
        p.icm2();
        p.icm3();
    }
}
interface I1
{
    void icm1();
    void icm2();

}
interface I2
{
    void icm3();

}
class P implements I1,I2
{


    @Override
    public void icm1()
    {
        System.out.println("ICM1 incomplete methods");
    }

    @Override
    public void icm2()
    {
        System.out.println("ICM2 incomplete methods");
    }

    @Override
    public void icm3()
    {
        System.out.println("ICM3 incomplete methods");
    }


    }







