package Enum;

public class enum_colourcode {
    public static void main(String[] args) {

        System.out.println(colors.Red.getHEXCODE());



    }


}

enum colors{
    Red("#FF0000"),Blue("#0000FF"),Green("#00FF00");

private String HEXCODE;
colors(String HEXCODE)
{
    this.HEXCODE=HEXCODE;
}
String getHEXCODE()
{
    return this.HEXCODE;
}



}
