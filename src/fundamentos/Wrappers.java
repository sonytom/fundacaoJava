package fundamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        //São os objetos das classes primitivas

        //byte
        Byte b=100;
        //short
        Short g =1000;
        //int
        Scanner entrada =new Scanner(System.in);
        Integer h= 10000;//Integer.parseInt(entrada.nextLine());
        //long
        Long u=1000000l;

        System.out.println(b.byteValue());
        System.out.println(g.toString());

        System.out.println("Digiter um numero");
        System.out.println(h*9);

        System.out.println(u/2l);

        Boolean boo = Boolean.parseBoolean("true");
        System.out.println(boo.toString().equals("Olar"));
        System.out.println(boo);

        Character t = '%';
        System.out.println(t.toString());





    }
}
