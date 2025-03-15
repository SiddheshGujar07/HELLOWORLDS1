public class Interview_Ternar_Operator {

//minor<18
//adult>18
//senior>65

    public static void main(String[] args) {

        int age=25; //Give me output of Adult

        String result=((age<18)? "Minor":((age<65)? "Adult": "Senior"));
        System.out.println(result);

        int age1=67;//Give me output of Senior

        String result1=((age1<18)? "Minor":((age1>65)? "Senior": "Adult"));
        System.out.println(result1);

        /// Give me a largest number






    }






}
