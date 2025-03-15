package Oops;

public class LAB02 {

    public static void main(String[] args)
    {

   student s1=new student();
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        s1.sleep();


    }



}

class student
{

    String name;
    int rollno;
    void sleep()
    {
        System.out.println("You can sleep");
    }


}




