package classesEmetodos.MenbrosVsInstancia;

public class ProdutoTest {
    public static void main(String[] args) {

        // classe define o tipo (Produto é o tipo)
        //duas instancias
        //3 atributos
        Produto p1 = new Produto("notebook",50000);

        Produto p2 = new Produto("notebook",4.0000);

        Produto p3 = new Produto("notebook",4.0000);

        Produto.DESCONTO = 0;

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());





        double precof = p1.precoComDesconto();



        double precof2 = p2.preco * (1 - Produto.DESCONTO);
        double media = (precof + precof2) /2;
        System.out.println("sua media dos dois produtos "+media);




    }




}
