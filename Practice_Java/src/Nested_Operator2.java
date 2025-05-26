public class Nested_Operator2 {

    public static void main(String[] args)
    {

        String age_strings=args[0];
        int age=Integer.parseInt(age_strings);
        System.out.println(age);

        String result=(age<18)?"Minor":((age>=18 && age<=65))?"Adult":"Senior";
        System.out.println(result);










    }











}
