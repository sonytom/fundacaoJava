package classesEmetodos.MenbrosVsInstancia;

public class AreaCircTest {
    public static void main(String[] args) {
        AreaCirc area = new AreaCirc(10);

//não se pode mais alterar o valor de pi
        // por estar associado a isntancia
        // area.pi = 0;
        System.out.println(area.area());

        AreaCirc area2 = new AreaCirc(0);


        // a instancia do bojeto é valido apenas para o ultimo elemento e faz referencia a todos os outros
        AreaCirc area3 = new AreaCirc(5);


        // para mudar os valores tem que
        // italico atributos de classe estaticos


        System.out.println(area.area());


        System.out.println(area2.area());

        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);

    }

}
