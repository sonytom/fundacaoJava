package fundamentos;

import java.util.Scanner;

public class DesComversao {
    public static void main(String[] args) {




        Scanner entrada = new Scanner(System.in);
        System.out.println("Num 1 ");
        String a = entrada.nextLine().replace(",",".");

        System.out.println("Num 2");
        String b = entrada.nextLine().replace(",",".");

        System.out.println("Num 3");
        String c = entrada.nextLine().replace(",",".");

        System.out.println("Nota :"+a+" Nota 2 :"+b+" Nota 3: "+c);

        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);
        double dc = Double.parseDouble(c);
        double soma = da+db+dc/3;

        System.out.println(soma);


    }
}
