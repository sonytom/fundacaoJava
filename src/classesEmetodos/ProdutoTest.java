package classesEmetodos;

public class ProdutoTest {
    public static void main(String[] args) {

        // classe define o tipo (Produto é o tipo)
        //duas instancias
        //3 atributos
        Produto p1 = new Produto();
        p1.nome = "notebook";
        p1.preco = 4300.00;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Computador";
        p2.preco = 4000.00;
        p2.desconto = 0.50;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        // um tem atributo e outro não 
        double precof = p1.precoComDesconto(0.500);
        double precof3 = p1.precoComDesconto();


        double precof2 = p2.preco * (1 - p2.desconto);
        double media = (precof + precof2) /2;
        System.out.println("sua media dos dois produtos "+media);




    }




}
