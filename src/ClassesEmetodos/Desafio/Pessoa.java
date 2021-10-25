package ClassesEmetodos.Desafio;

public class Pessoa {

    String nome;
    double peso;


    Pessoa (String nome,double peso){
        this.nome = nome;
        this.peso = peso;
    }

      double comer (double pesocomida){

        Comida c1 = new Comida(pesocomida);
          pesocomida = this.peso + c1.pesoComida;

       return pesocomida;
    }

    void historico (){
        System.out.println("O pesso inicial da pessoa :"+ this.nome+" e seu peso de "+this.peso);

        // System.out.println("O pesso inicial da pessoa :"+ nome+" e seu peso de "+peso);

    }

}
