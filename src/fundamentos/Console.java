package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        // sem quebra de linha
        System.out.print("olar");
        //com quebra de linha
        System.out.println("Olar");
        //sout com format
        System.out.printf("Numeros da megasena %d %d %d %d %d %d ln",1,2,3,4,5,6);
        System.out.println("");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = entrada.nextLine();
        System.out.println("Seu nome é "+nome);



        System.out.println("Digite o sua idade");
       int idade = entrada.nextInt();
        System.out.printf("Sua idade é %d",idade);;

        entrada.close();
    }


}
