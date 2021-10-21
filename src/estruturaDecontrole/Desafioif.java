package estruturaDecontrole;

import java.util.Scanner;

public class Desafioif {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o dia da semana");
        String dsemana = entrada.nextLine();

        if (dsemana.equalsIgnoreCase("segunda")){
            System.out.println("1");
        } else if (dsemana.trim().equalsIgnoreCase("terca")){
            System.out.println("2");
        } else if (dsemana.trim().equalsIgnoreCase("quarta")){
            System.out.println("3");
        } else if (dsemana.trim().equalsIgnoreCase("quinta")){
            System.out.println("4");
        } else if (dsemana.trim().equalsIgnoreCase("sexta")){
            System.out.println("5");
        }else if (dsemana.trim().equalsIgnoreCase("sabado")){
            System.out.println("6");
        }else  if (dsemana.trim().equalsIgnoreCase("domingo")){
            System.out.println("7");
        }else {
            System.out.println("Dia invalido");
        }


    }





}
