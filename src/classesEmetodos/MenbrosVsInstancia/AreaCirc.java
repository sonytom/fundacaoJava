package classesEmetodos.MenbrosVsInstancia;

public class AreaCirc {
// difiniu a varial para a classe e não as instancias ou seja não mudara

    double raio;
    // uma constatne para não ser muddade add final
    // e não se pode mais alterar o valor de pi
    // nem declarar ele no construtor // não altera
     final static double PI=3.1415;


    AreaCirc (double raioinical){

           raio =raioinical;

    }

    double area (){

                     // pow é um metodo estatico
        return PI*Math.pow(raio,2);
       // return pi*raio*raio;

    }



}
