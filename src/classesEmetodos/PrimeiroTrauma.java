package classesEmetodos;

public class PrimeiroTrauma {

    static int a=3;
    int b=4;
// não pode mexer aqui
    public static void main(String[] args) {
// pode mexer aqui

        // resolução
        // é preciso criar uma instancia para acessar
        PrimeiroTrauma pr = new PrimeiroTrauma();
       //como é do mesmo tipo static ele comsegue acessar
        System.out.println(pr.b);

        System.out.println(a);

    }
}
