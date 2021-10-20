package fundamentos;

public class AreaCircuferencia {

    public static void main(String[] args) {

        float raio = 3.4f;
        // final não pode alterar o valor da variavel
        final float pi= 3.14159f;

        float area = pi * raio * raio;
        System.out.println(area);

        raio = 5;
        area = pi * raio *raio;
        System.out.println("Area = "+ area + " m2");

        var a =4;
        System.out.println(a+"ashdkajhsdkjlahlsdaklsd");




    }

}
