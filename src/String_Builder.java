public class String_Builder {

    public static void main(String[] args) {


        StringBuilder stringBuilder=new StringBuilder("Gujar");
        stringBuilder.append("Siddhesh");
        System.out.println(stringBuilder);

        StringBuilder sc=new StringBuilder("Hello");
        sc.append("Its my world");
        System.out.println(sc.toString());  ///String Builder means syncronization and ccoupied less space seee in  notes.
        //sc.reverse();//
        System.out.println(sc);
        sc.append("Is very nice");
        System.out.println(sc);


        String s1="Siddhesh";
        String s2="Gujar";
        String s3=s1 + s2;
        System.out.println(s3);
        System.out.println(s1.concat(s2));







    }










}
