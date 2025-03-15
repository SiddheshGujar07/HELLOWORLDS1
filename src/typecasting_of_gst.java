public class typecasting_of_gst {

    public static void main(String[] args) {
        int price1=100;
        float price2=18.45f;
        int final_price=price1+(int)price2; //Narrowing
        float total_price=price1+price2;// widening m
        System.out.println(final_price);
        System.out.println(total_price);




    }



}
