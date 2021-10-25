package classesEmetodos;

public class Produto {

    String nome;
    double preco;
    double desconto;


    // caso o objeto ja tenha os dados declarados não é necessarios
    // declaralos novamente

                            //  aqui
  double precoComDesconto (/*double preco, double desconto*/){
      return preco* (1-desconto);
  }


    double precoComDesconto (double descontoColab){
        return preco* (1-desconto+descontoColab);
    }


}
