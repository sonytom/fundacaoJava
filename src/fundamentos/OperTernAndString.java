package fundamentos;

public class OperTernAndString {

    public static void main(String[] args) {
        double media = 2;
        String media2;
       // String resultadoparcial= media >= 5.0 ? "Em recuperação." :
       //         "reprovado" ;
      //  String resultadoFinal = media >= 7.0 ? "Aprovado." : resultadoparcial ;

         String resultadoFinal = media >= 7.0 ? "Aprovado." : media >= 5.0 ? "Em recuperação." :
                 "reprovado" ; ;

        System.out.println("o Aluno esta "+ resultadoFinal);


        double nota = 9.9;
        boolean bomcompot = false;
        boolean passouporm = nota >=7;

        // as duas cond tem que ser verdadeira
        boolean temdesc = bomcompot && passouporm;
        // apenas uma tem que ser verdadeira para ser true
        boolean temoutr = bomcompot || passouporm;


        String result = temdesc ? "sim" : "nao";

        System.out.println(temdesc);
        System.out.println(temoutr);

        System.out.println("Tem desconto ? " +result);



    }
}
