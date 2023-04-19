package E_Collections;

import A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso.Cliente;

import java.util.*;

public class ExemploHashSetCliente {


    public static void main(String args[]){
        //Retorna uma Lista de Strings
        GetClientes();


    }
    public static void GetClientes(){
        Set<Cliente> listaClientes = new HashSet<Cliente>();
        Cliente a = new Cliente("Dário","Especialista Angular/Java","Av Guararapes",12312d);
        Cliente b = new Cliente("Ester","Especialista Angular/Java","Av 171",52312d);
        Cliente c = new Cliente("Anna","Especialista Angular/Figma","Av IPU sem rima",02312d);
        Cliente d = new Cliente("Anna","Especialista Angular/Figma","Av IPU sem rima",02312d);
        listaClientes.add(a);
        listaClientes.add(b);
        listaClientes.add(c);
        listaClientes.add(d);

        System.out.println(listaClientes);
    }

    }
