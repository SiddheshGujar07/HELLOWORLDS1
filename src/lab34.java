public class lab34 {

    public static void main(String[] args) {

        String s1="Siddhesh";
        String s2="Gujar";
        String s5="SIDDHESH";

        String s3=new String("Siddhu");
        String s4=new String("Gujar");

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5));//True
        System.out.println(s1.equalsIgnoreCase(s5));///equalignore case ->Siddhesh,SIDDHESH,SidDhesh.







    }




}
