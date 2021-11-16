package apresentacao.pilares.exeption.exeption;

import java.io.File;
import java.io.IOException;

public class ExeptionsTest {
    private static void criarNovoArquivo(){

        File file = new File("src/apresentacao/pilares/arquivo/teste.txt");

//cheked java te força
        //file.createNewFile()

        try {
            System.out.println("Criando Arquivo");
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado "+ isCreated);
        } catch (IOException e  /* ou  Exeption*/  )  {
            // nunca deixar em branco
            // nunca colcoar regra de negocio


            // mostra toda a strack de erros // mostra todos os erros relacionados
            e.printStackTrace();
        }




    }


    public static void main(String[] args) {
        criarNovoArquivo();

    }


}
