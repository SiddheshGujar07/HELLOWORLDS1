package Array;

public class Lec01 {

    public static void main(String[] args) {

        int[] marks={1,2,3,4,5};
        System.out.println(marks.length);

        marks[0]=91;
        marks[1]=81;
        marks[2]=51;
        marks[3]=45;

        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[11]);///ArrayIndexoutofBoundsException.
        System.out.println(marks.length);







    }




}
