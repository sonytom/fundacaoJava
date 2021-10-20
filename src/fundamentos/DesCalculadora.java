package fundamentos;

import java.util.Scanner;

public class DesCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int a = entrada.nextInt();
        System.out.println("Digite o operando");
        String operando = entrada.next();
        System.out.println("Digite o segundo numero");
        int b = entrada.nextInt();


    double result = "+".equals(operando) ? a + b :0;

        result = "-".equals(operando) ? a - b :0;
        result = "/".equals(operando) ? a / b :0;
        result = "*".equals(operando) ? a * b :0;

        System.out.printf("%d %s %d",a,operando,b);
        System.out.println();
        System.out.println(result);




    }
}
