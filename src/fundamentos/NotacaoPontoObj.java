package fundamentos;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class NotacaoPontoObj {

    public static void main(String[] args) {
        //tipos primitivos não tem notação ponto.
        String a = "a";
        Double b= 4.0;
        Integer c = 4;



        System.out.println(a);
        a = a.toUpperCase(Locale.ROOT);
        System.out.println(a);

        a= a.replace("A","b");
        System.out.println(a);

        System.out.println("Car".toUpperCase(Locale.ROOT).replace("CAR","Bus").concat("car"));


        b.equals(a);

        System.out.println(b);



    }


}
