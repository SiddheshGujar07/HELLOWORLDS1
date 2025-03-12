package Oops.supers;

public class father {

father()
{
    System.out.println("DC FATHER");
}
int gold=1000;
void home()
{
    System.out.println("Father have ow home");
}

}
class son extends father
{

    void t1()
    {
        super.home();
    }

}

