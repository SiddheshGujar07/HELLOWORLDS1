package Oops.Encapsulation;

public class realexample_dbsbank {

    private String name; ///private means no one can acces to password.
    private  long bal;

    public realexample_dbsbank(String name, long bal)
    {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean cashier) {
        if(cashier)
        {
            this.bal = bal;
        }

        else
        {
            System.out.println("Not allowed");
        }
    }


    public static void main(String[] args) {

        realexample_dbsbank siddhesh=new realexample_dbsbank("Siddhu",100);
        //System.out.println(siddhesh.getBal());//
        boolean cashier=true;
        siddhesh.setBal(10000,false);
        System.out.println(siddhesh.getBal());







    }





}
