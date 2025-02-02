public class UserFunction2 {

//With Parameter and Without Return Type


    static void only_first_name(String name) {
        System.out.println("First name is " + name);
    }

    static void full_name(String firstname, String lastname) {
        System.out.println("Fisrt name is" + firstname + "\nLastname" + lastname);
    }

    static void age(int age) {
        System.out.println("My age is:" + age);


    }
    static void full_details(String name,double salary,int age)
    {
        System.out.println("Name is "+name+"Salary is "+salary+"My age is"+age);
    }


    public static void main(String[] args)
    {

     only_first_name("Siddhesh");
     only_first_name("Amit");
     full_name("Siddhes","Gujar");
     age(30);
    full_details("Siddhesh",4000,30);

    }
}







