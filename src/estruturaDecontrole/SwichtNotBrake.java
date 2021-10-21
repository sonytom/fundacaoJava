package estruturaDecontrole;

public class SwichtNotBrake {


    public static void main(String[] args) {
        String faixa="verde";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("faixa preta");
            case "marrom":
                System.out.println("faixa marron");
            case "roxa":
                System.out.println("faixa roxa");
            case "verde":
                System.out.println("faixa verde");
            default:
                System.out.println("sei nada");
        }

    }
}
