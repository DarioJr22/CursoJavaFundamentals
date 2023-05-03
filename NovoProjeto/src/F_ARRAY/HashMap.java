package F_ARRAY;

import java.util.Map;
import java.util.Set;

public class HashMap {

    public static void main(String i []){
        valuesHash();
        keysHash();
        entrySet();
    }


    public static void valuesHash(){
        System.out.println("exemplo Map");
        Map<Integer, String> listaHash= new java.util.HashMap<>();
        listaHash.put(1,"Dário");
        listaHash.put(2,"Fran");
        listaHash.put(3,"Zeq");
        listaHash.put(4,"Fernando");
        listaHash.put(5,"Cesar");

        for(String value:listaHash.values()){
            System.out.println(value);
        }
    }

    public static void keysHash(){
        System.out.println("exemplo Map");
        Map<Integer, String> listaHash= new java.util.HashMap<>();
        listaHash.put(1,"Dário");
        listaHash.put(2,"Fran");
        listaHash.put(3,"Zeq");
        listaHash.put(4,"Fernando");
        listaHash.put(5,"Cesar");

        for(Integer value:listaHash.keySet()){
            System.out.println(value);
        }
    }

    public static void entrySet(){
        System.out.println("exemplo Entries");

        Map<Integer, String> listaHash= new java.util.HashMap<>();
        listaHash.put(1,"Dário");
        listaHash.put(2,"Fran");
        listaHash.put(3,"Zeq");
        listaHash.put(4,"Fernando");
        listaHash.put(5,"Cesar");
        Set<Map.Entry<Integer, String>> entries= listaHash.entrySet();


        for(Map.Entry<Integer, String> e:entries){
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }


    }








}
