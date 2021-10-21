package estruturaDecontrole;

public class Brake {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if(i ==4){
                System.out.println("entoru");
                // sai de todos os laços
                break;
            }
            System.out.println(i);
        }
    }
}
