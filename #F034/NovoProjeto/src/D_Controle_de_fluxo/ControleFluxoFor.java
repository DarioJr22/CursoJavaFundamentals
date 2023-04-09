package D_Controle_de_fluxo;

import java.util.ArrayList;
import java.util.List;

public class ControleFluxoFor {
    public static void main(String args[]){

        List<Integer> valores = new ArrayList<>();

        for(int i = 0; i <= 10;i++){
            System.out.println("linha" + i);
            valores.add(i);
        }

        for(Integer i:valores){
            System.out.println("linha" + i);
        }

        valores.forEach(i -> System.out.println("Linha" + i));

    }
}
