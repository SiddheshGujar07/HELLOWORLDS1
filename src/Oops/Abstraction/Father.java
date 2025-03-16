package Oops.Abstraction;

abstract class Father {
 abstract void loan50k();
 void loan25k()
 {
     System.out.println("Given 20k");
 }

}
class child extends Father{

    @Override
    void loan50k()
    {
        System.out.println("SON PAY 50K");
    }


}

class Abstract{

    public static void main(String[] args) {

       child c=new child();
       c.loan50k();
       c.loan25k();







    }




}

