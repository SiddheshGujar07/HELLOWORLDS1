package Oops;

public class mobile {

String model_name;
String year_of_launch;

mobile(String model_name_c,String year_of_launch_c)
{

    this.model_name=model_name_c;
    this.year_of_launch=year_of_launch_c;

}

void display()
{

    System.out.println(this.model_name + this.year_of_launch);
}

    public static void main(String[] args) {

    mobile m1=new mobile("Oppo","2004");
        System.out.println(m1.model_name);
        System.out.println(m1.year_of_launch);

    mobile m2=new mobile("VIVO","2001");
        System.out.println(m2.model_name);
        System.out.println(m2.year_of_launch );





    }



}
