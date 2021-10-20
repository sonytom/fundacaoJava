package fundamentos;

public class Temperatura {



    public static void main(String[] args) {

        // f - 32 ) x 5/9 = c

        final double fator =5.0/9.0;
        final double ajuste= 32;

        double fahrenheit =86;
        double celcius = (fahrenheit - ajuste);
        System.out.println("Resultado " + celcius);

        fahrenheit = 0;
        celcius = (fahrenheit-ajuste) * fator;
        System.out.println("resultado "+ celcius);

    }

}
