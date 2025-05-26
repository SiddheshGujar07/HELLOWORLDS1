package Exception;

public class realexample {

    public static void main(String[] args) {

        int a=0;
        int b=0;
        try {
            int c=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String s1= null;
        try {
            s1 = null;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());        }
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public static class try_class {

        public static void main(String[] args) {

            System.out.println("1");
            try {
                int a = 10 / 0;
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("ok");
                System.out.println(e.getMessage());
            }
            System.out.println("2");

        }
    }
}
