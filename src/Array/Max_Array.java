package Array;

public class Max_Array {


    public static void main(String[] args) {
        int[] array = {10, 34, 23, 44, 23, 33};

        int maximum = give_max(array);
        System.out.println(maximum);


    }

    static int give_max(int[] array) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {

                max = array[i];

            }
        }

        return max;
    }
}