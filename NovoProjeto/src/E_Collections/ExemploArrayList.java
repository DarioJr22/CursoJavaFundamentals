package E_Collections;

import A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso.Cliente;
import A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso.ComparaCodigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {


    public static void main(String args[]){
        //Retorna uma Lista de Strings
        listaString();
        listaNumeros();
        GetClientes();

    }

    public static void listaString(){
        System.out.println("Exemplos lista simples");
        List<String> lista = new ArrayList<String>();
        lista.add("Dário");
        lista.add("Ester");
        lista.add("Luana");
        lista.add("ALuana");
        Collections.sort(lista);
        System.out.println(lista);
    }

    public static void listaNumeros(){
        System.out.println("Exemplos lista simples - Números");
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(4);
        lista.add(2);
        lista.add(3);
        Collections.sort(lista);
        System.out.println(lista);
    }

    public static void GetClientes(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        Cliente a = new Cliente("Dário","Especialista Angular/Java","Av Guararapes",12312d);
        Cliente b = new Cliente("Ester","Especialista Angular/Java","Av 171",52312d);
        Cliente c = new Cliente("Anna","Especialista Angular/Figma","Av IPU sem rima",02312d);
        listaClientes.add(a);
        listaClientes.add(b);
        listaClientes.add(c);
        Collections.sort(listaClientes);
        System.out.println(listaClientes);

        //Ordenando pelo código
        ComparaCodigo comparador = new ComparaCodigo();
        Collections.sort(listaClientes,comparador);
        System.out.println("Lista Ordenada pelo código" +listaClientes);

    }


}
