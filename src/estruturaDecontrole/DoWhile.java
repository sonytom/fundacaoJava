package estruturaDecontrole;

import java.util.Scanner;

// vai ser usada no minimo uma vez
public class DoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra="";
do {
    System.out.println("Digite a palavra correta");
     palavra = entrada.nextLine();
}while (!palavra.equalsIgnoreCase("sair"));





    }

}
