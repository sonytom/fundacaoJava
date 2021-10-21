package estruturaDecontrole;

import javax.swing.*;
import java.util.Scanner;

public class Ifelse {


        public static void main(String[] args) {

           String valor = JOptionPane.showInputDialog("Coloque o numero");
           int numero = Integer.parseInt(valor);

           if (numero % 2 ==0){
               System.out.println("Numero par");
           }else {
               System.out.println("Numero impar");
           }


        }
    }


