public class Ternary_Operator {

    public static void main(String[] args) {

        //Take inputs--Comand Line

        String age_string=args[0];//String may convert kiya
        int age=Integer.parseInt(age_string);///Integer may convert kiya.
        System.out.println(age);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);

        String canivote=age>=18? "yes you can vote":"No,we cannot vote";
        System.out.println(canivote);
        int marks=90;
        String grade=marks<=100? "Grade A": "Grade B";
        System.out.println(grade);





    }






}
