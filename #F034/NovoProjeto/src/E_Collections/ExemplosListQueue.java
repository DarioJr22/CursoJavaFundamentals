package E_Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemplosListQueue {
    public static void main(String args[]){

        listaNumeros();

    }


    public static void listaNumeros(){
        System.out.println("Exemplos lista simples - Números");
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(1);
        queue.add(4);
        queue.add(2);

        while(queue.size() != 0 ){
            System.out.println("Removido"+queue.remove());
        }
    }

}
