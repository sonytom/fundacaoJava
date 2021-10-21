package estruturaDecontrole;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double media = entrada.nextDouble();
        entrada.close();

        if (media >=6 )
            //vai aparecer a mensagem por
            // ececutar apenas 1 linha apor o if
            System.out.println("Aprovado");
        //ele não retornará a mensagem pois
        // não está dentro do bloco de codigo
            System.out.println("Parabens");

        if (media >= 6.0 && media <=10){
            System.out.println("Aprovado");
        }
        if (media <6 && media >=4){
            System.out.println("Recuperação");
        }

        boolean CritRepro = media >= 0 && media <4;

        if (CritRepro){
            System.out.println("reprovado");
        }


    }
}
