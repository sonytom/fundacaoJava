package fundamentos;

import java.util.Locale;

public class StringObj {


    public static void main(String[] args) {

        String tom="TOM";
        System.out.println(tom.concat(" Xau -"));
        System.out.println(tom + " - xau");
        System.out.println(tom.startsWith("T"));
        System.out.println(tom.toLowerCase().startsWith("t"));
        System.out.println(tom.length());
        System.out.println(tom);
        System.out.println(tom.toLowerCase().equalsIgnoreCase("tom"));

        var nome = "Rafaela";
        var idade = 25;


        System.out.println("A "+nome+" tem uma idade de "+idade);
         //%s subistituição strig
         //%d subistituição int
        System.out.printf("A %s tem uma idade de %d", nome,idade);

        String frase = String.format("A %s tem uma idade de %d",nome,idade);

        System.out.println(frase.toUpperCase());

        



    }

}
