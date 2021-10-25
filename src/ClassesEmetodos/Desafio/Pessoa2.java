package ClassesEmetodos.Desafio;

public class Pessoa2 {

    String nome;
    double peso;

    Pessoa2(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer (Comida2 comer) {
            if(comer != null){
                this.peso += comer.peso;


            }


    }

    String Apresentar(){
        return "Olá sou "+nome+"e meu peso é de "+peso;
    }


}
