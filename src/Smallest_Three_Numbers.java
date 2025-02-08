public class Smallest_Three_Numbers {

    public static void main(String[] args) {

     int n1=7, n2=1,n3=11;

     int smallest=(n1<=n2)?((n1<=n3)?n1:n3):(((n2<=n3)?n2:n3));

        System.out.println(smallest);




    }






}
