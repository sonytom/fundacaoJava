package fundamentos;

import javax.swing.*;

public class StringToNum {


    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(
                "Digite seu numero 1");
        String valor2 = JOptionPane.showInputDialog(
                "Digite seu numero 2");
        System.out.println(valor+ valor2);
        // comverte string para double parse
        double dnum = Double.parseDouble(valor);
        double dnum2 = Double.parseDouble(valor2);
        double some = dnum +dnum2;
        System.out.println(some/2);




    }

}
