package D_Controle_de_fluxo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioTabuadFor_BreakContinue {
    public static void main(String args[]){
        List<Integer> valores = new ArrayList<>();

        for (int x = 1; x <= 10; x++){
            valores.add(x);
            if(x == 10){
                int finalX = x;
            //    valores.forEach(y -> System.out.println(finalX + "x" + y + " = " + finalX *y));
              //  System.out.println("***************");
            }
        }


        //Break

        for (int x = 1; x <= 1000; x++){
            System.out.println("Repetição numero: " + x);
            if(x == 100){
                System.out.println("Pare na repetição nr: " + x);
                break;
            }
        }

        //Continue

        for (int x = 1; x <= 1000; x++){
            if(x % 5 !=0){
                continue;
            }
            System.out.println("Multiplo de 5: " + x);
        }
    }
}
