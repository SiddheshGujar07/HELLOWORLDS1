package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LEC02 {

    public static void main(String[] args) {

        int [] marks={10,20,17,9,12};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);

        System.out.println("-----");

        for (int p=0;p<marks.length;p++)
        {
            System.out.println(marks[p]);

        }

        Arrays.sort(marks);






    }



}
