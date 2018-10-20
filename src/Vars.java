import java.text.DecimalFormat;

public class Vars {

    public static void main(String[] args) {

        /*boolean b = true;
        System.out.println(b);*/

        double x = 12e-22;

        DecimalFormat decimalFormat = new DecimalFormat("#.###############################################");
        System.out.println(decimalFormat.format(x));

        //notacja do zapisu dużych liczb
        int i = 3_500_000;
        System.out.println(i);

        int a = 5;
        int b = 2;
        System.out.println(a/b);


    }
}
