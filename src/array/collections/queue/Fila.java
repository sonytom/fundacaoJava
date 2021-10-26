package array.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {


    public static void main(String[] args) {

        Queue <String> fila = new LinkedList<String>();


        // add


        // os dois adicionan elementos na lista


        // diferença quando se tem fila com restrição de tamanho ex até 100
        // neste da erro lança exeption
        fila.add("Ana");

// neste retora true or false
        // neste apenas retorna false
        fila.offer("Bia");


        fila.add("Carlos");
        fila.add("Rafaela");


        System.out.println(fila.peek());



    }
}
