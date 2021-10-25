package ClassesEmetodos.construtores;

import ClassesEmetodos.Produto;

public class Costrutor {

    // metodos especiais que crian novos objetos apartir das classes
    // portal classe objeto
    // quando se define uma classe tera um comstrutor com o mesmo nome da classe
    // nome da classe e do construtor são iguais
    // mesmo que não é escrito um construtor é dado um padrao
    // se criar um novo é perdido o original.

    // exemplo

                         // construtor padrao da classe
         Produto p1 = new Produto();
    // classe

// definese um construtor com a auxencia de retorno exx void

    // pode ter quantos construtores que quiser
Costrutor (int a){ }
    // so depende da assinatura do metodo
Costrutor (){ }

    public static void main(String[] args) {

    Costrutor c1 = new Costrutor(2);


    }

    // nome da classe  --- > construtor
    // construtor não tem retorno

}
