package classesEmetodos.Desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 80.0);
        Comida c1 = new Comida("feijao",100);

        Comida c2 = new Comida("Strogonoff", 20.0);


        System.out.println(c1.pesoComida);
        System.out.println(p1.peso);


        System.out.println(p1.comer(c1.pesoComida+c2.pesoComida));

        System.out.println(p1.comer(c1.pesoComida));

        p1.historico();







    }
}
