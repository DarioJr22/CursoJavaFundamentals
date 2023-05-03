package F_ARRAY;

import java.util.Map;

public class HashMap {

    public static void main(String i []){
        System.out.println("exemplo Map");
        Map<Integer, String> listaHash= new java.util.HashMap<>();
        listaHash.put(1,"Dário");
        listaHash.put(2,"Lua");
        listaHash.put(3,"Lally");
        listaHash.put(4,"mAE");
        listaHash.put(5,"ASDASD");

        for(String value:listaHash.values()){
            System.out.println(value);
        }
    }






}
