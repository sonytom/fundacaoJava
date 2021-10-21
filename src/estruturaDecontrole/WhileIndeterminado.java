package estruturaDecontrole;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      String a="";

        while (!a.equalsIgnoreCase("sair")){
            System.out.println("Digite a frase");
            a = entrada.nextLine();

        }


    }


}
