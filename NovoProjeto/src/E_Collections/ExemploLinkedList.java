package E_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String args[]){
        //Retorna uma Lista de Strings
        listaString();
        listaNumeros();


    }

    public static void listaString(){
        System.out.println("Exemplos lista simples");
        List<String> lista = new LinkedList<>();
        lista.add("Dário");
        lista.add("Ester");
        lista.add("Luana");
        lista.add("ALuana");

        System.out.println(lista);
    }

    public static void listaNumeros(){
        System.out.println("Exemplos lista simples - Números");
        List<Integer> lista = new LinkedList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(2);
        //Adiciona á lista
        lista.add(3);
        //Remove da lista
        lista.remove(0);
        //verifica se contem
        boolean c = lista.contains(1);
        System.out.println(lista +" Contem ?" + c );
    }
}
