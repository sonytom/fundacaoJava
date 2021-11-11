package apresentacao.pilares.polimorfismo.exePoli.visao;

import apresentacao.pilares.polimorfismo.exePoli.modelo.Computador;
import apresentacao.pilares.polimorfismo.exePoli.modelo.Produto;
import apresentacao.pilares.polimorfismo.exePoli.modelo.Tomate;

public class test3 {
    public static void main(String[] args) {
     //whintening cast

        Produto produto = new Computador("Ryzen", 500);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

          // generico  - > Especifico
        Produto produto2 = new Tomate("Italiano", 500);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());


       // não pode executar porque produto não tem como saber
        //produto2.test
                // então a garantia que a herança da é que todos os atribudos que temos na super classe são herdaddos na subclasse
//






    }
}
