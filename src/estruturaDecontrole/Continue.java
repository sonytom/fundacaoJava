package estruturaDecontrole;

public class Continue {
    public static void main(String[] args) {
//continue sai do laço atual pulando o if
        for (int i = 0; i < 10; i++) {

            if (i %2 ==1){
                continue;
            }
            System.out.println(+i);
        }

        for (int j = 0; j < 10; j++) {

            if (j==1){
                continue;
            }
            System.out.println(+j);
        }

    }

}
