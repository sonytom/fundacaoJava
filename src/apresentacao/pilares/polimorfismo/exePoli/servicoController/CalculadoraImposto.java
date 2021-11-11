package apresentacao.pilares.polimorfismo.exePoli.servicoController;

import apresentacao.pilares.polimorfismo.exePoli.modelo.Computador;
import apresentacao.pilares.polimorfismo.exePoli.modelo.Produto;
import apresentacao.pilares.polimorfismo.exePoli.modelo.Tomate;

public class CalculadoraImposto {

    // caso tu não esteja acessando nem um atributo de classe pode transformar esses metodos em staticos

    public static void calcularImpostoComputador(Computador computador){

        System.out.println("Relatorio de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador :" + computador.getNome());
        System.out.println("Valor : "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }


    public static void calcularImpostoTomate(Tomate tomate){

        System.out.println("Relatorio de Imposto do Computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate :" + tomate.getNome());
        System.out.println("Valor : "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }


    public static void calcularImposto(Produto produto){
       double imposto= produto.calcularImposto();
        System.out.println("Tomate :" + produto.getNome());
        System.out.println("Valor : "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

    }
}
