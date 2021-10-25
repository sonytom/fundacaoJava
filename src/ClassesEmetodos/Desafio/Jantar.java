package ClassesEmetodos.Desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 80.0);
        Comida c1 = new Comida("feijao",100);
<<<<<<< HEAD
        Comida c2 = new Comida("Strogonoff", 20.0);
=======
>>>>>>> main

        System.out.println(c1.pesoComida);
        System.out.println(p1.peso);

<<<<<<< HEAD
        System.out.println(p1.comer(c1.pesoComida+c2.pesoComida));
=======
        System.out.println(p1.comer(c1.pesoComida));
>>>>>>> main

        p1.historico();







    }
}
