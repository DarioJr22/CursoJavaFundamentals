package F_ARRAY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArraysExercicio {
     public static void main(String i []){
         leitorNomesSplit();
     }


        public static void separadorHash(){
            String[] molieres;
            String[] hombres;
            Map<String,String> pessoas = new HashMap<>();
            pessoas.put("Fernando","M");
            pessoas.put("Felipe","F");
            pessoas.put("Fran", "F");
            pessoas.put("Dário","M");
            pessoas.put("Ezequiel","M");
            pessoas.put("Dartã","M");
            Set<Map.Entry<String,String>> entries = pessoas.entrySet();


            for(Map.Entry<String, String> i:entries){
//
//                i.getValue() == "F" ? molieres.

            }

        }
     public static void leitorNomesSplit(){
         System.out.println("Digite nomes separados por virgulas:");
         Scanner s = new Scanner(System.in);
         String nomes = s.next();
         String[] arrayNomes = nomes.split(",");
             for(String i:arrayNomes){
                 System.out.println(i);
             }

     }
}
