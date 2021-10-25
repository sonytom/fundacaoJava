package classesEmetodos.MenbrosVsInstancia;

public class Produto {

    String nome;
    double preco;
    static double DESCONTO = 0.50;

Produto (String nomeinical,double precoinicila){
    nome = nomeinical;
    preco= precoinicila;


}

    // caso o objeto ja tenha os dados declarados não é necessarios
    // declaralos novamente

                            //  aqui
  double precoComDesconto (/*double preco, double desconto*/){

      return preco* (1-DESCONTO);
  }


    double precoComDesconto (double descontoColab){

      return preco* (1-DESCONTO+descontoColab);
    }


}
