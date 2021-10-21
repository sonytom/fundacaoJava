package estruturaDecontrole;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double nota=0.0;
        double total=0;
        int cont=0;

        while (nota != -1){
            System.out.println("Digite nota  \n");
            nota = entrada.nextDouble();

           if (nota >=0 && nota <= 10){

                cont ++;
                total = total+nota;

            }else if(nota != -1){
               System.out.println("nota invalida");
           }
        }

        double media = total/cont;

        System.out.println(total);
        System.out.println(cont);
        System.out.println("a media é " + media);

    }
}
