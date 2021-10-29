package apresentacao.pilares.polimorfismo.dinamico;

public class Test {
    public static void main(String[] args) {


        Carro  c = new Uno ();

        c= new Ferrari();
        c = new Escort();
        // o objeto c pode virar qualquer polimorfar qualquer classe especifica

    }
}
