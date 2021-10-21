package estruturaDecontrole;

import java.util.Scanner;

public class SwichtWihtBrake {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String conceito="";
        System.out.println("a nota: ");
        int nota= entrada.nextInt();

        switch (nota){
            case 10: case 9:
            conceito ="A" ;
            break;
            case 8: case 7:
                conceito ="B" ;
            break;
            default:
                conceito="Não informado";
        }

        System.out.println("Conceito"+conceito);
        entrada.close();

    }
}
