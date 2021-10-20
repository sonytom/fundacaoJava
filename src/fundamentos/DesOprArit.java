package fundamentos;

public class DesOprArit {

    public static void main(String[] args) {


        double baixoA ;
        double cimaA;
        double respotC;
        baixoA = 3*2;
        cimaA = 6*(3+2);

        respotC = Math.pow(cimaA,2)/baixoA;

        System.out.println(respotC);



        double cimaB;
        double baixoB ;
        double respotDir;
        baixoB = 2;
        cimaB = ((1-5) * (2-7))/baixoB;
        respotDir = Math.pow(cimaB,2);
        System.out.println(respotDir);


        //final

        double pot3 = Math.pow(10,3);

        double resultado = (respotC - respotDir);

        System.out.println(resultado);

          resultado = Math.pow(resultado,3);

        System.out.println(resultado/pot3);


    }
}
