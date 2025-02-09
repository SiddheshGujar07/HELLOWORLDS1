public class String_Interview {

    public static void main(String[] args) {

        String s1="Siddhesh";

        //1.length
        System.out.println(s1.length());

        //2.charact

        System.out.println(s1.charAt(4));

        //3.contains

        System.out.println(s1.contains("dh"));

        // 4.contains-false
        System.out.println(s1.contains("ha"));

        //concat

        System.out.println(s1.concat("Gujar"));

        // 5.equalsIgnoreCase()

        System.out.println(s1.equalsIgnoreCase("siddhesh"));

        System.out.println(s1.equalsIgnoreCase("SiDdhesh"));

        // 6. indexOf() //

        System.out.println(s1.indexOf('i'));

        //7.replace

        System.out.println(s1.replace("h","g"));

        System.out.println(s1.replace('g','h'));



        //8.split
       String s2="Vishwanath@gmail@.com";

        System.out.println(s2.split("@"));

        //9.Substring.

        String s3="Wikipedia";
        System.out.println(s3.substring(2,5));
        //System.out.println(s3.substring(2,12));///-String index out of Bound Exception.

        //10.to lower case and uppdercase.
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());

        //11.Starts with and ends with
        System.out.println(s3.startsWith("W"));
        System.out.println(s3.endsWith("a"));

        //12.compare to Ignore case()

        System.out.println(s3.compareToIgnoreCase("Wikipedia"));
















    }








}
