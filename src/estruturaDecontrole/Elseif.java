package estruturaDecontrole;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("nota 1 ");
        double nota = entrada.nextDouble();

        if (nota <0 || nota > 10){
            System.out.println("nota invalida");
        }else if (nota >=9) {
            System.out.println("Aprovado A");
        } else if (nota >=7){
            System.out.println("Aprovado B");
        }else if (nota >=6){
            System.out.println("Aprovado C");
        }else {
            System.out.println("Reprovado Z");
        }

                entrada.close();

    }
}
