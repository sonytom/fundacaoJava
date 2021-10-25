package classesEmetodos.construtores;

public class Produto {
// o valor sera o mesmo em todos as instancias/ objetos
    static String nome= "olar";
    double preco;
    double desconto;

    Produto (String nomeInicial){
        nome = nomeInicial;
    }

    Produto (){

    }

    Produto (String nomeInicial,double precoinical,double descontoinicial){
        nome = nomeInicial;
        preco = precoinical;
                desconto = descontoinicial;
    }


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
