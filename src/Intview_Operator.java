public class Intview_Operator {

    public static void main(String[] args) {

            int marks=58;

            String grade=(marks>=90 &&marks<=100)?"A":
                    (marks>=80 &&marks<=89)?"B":
                    (marks>=70 &&marks<=79)?"C":
                            (marks>=60 &&marks<=69)?"D":
                                    (marks>=0 &&marks<=59)?"F":"Invalid value";


            System.out.println(grade);





    }

    }
