package D_Controle_de_fluxo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_ControleFluxo {
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    List<Float> notas = new ArrayList<>();

    int unidade = 0;
        while(unidade <= 4){
            unidade++;
            System.out.println("Qual sua nota na unidade" + unidade + " ?");
            Float notaUnidade = s.nextFloat();
            notas.add(notaUnidade);
            if (unidade == 4){
                Float somatorio = 0f;
                for (Float i: notas){
                  somatorio += i;
                }
                Float media = (somatorio/ unidade);
                System.out.println("Sua média foi: " + media  + " !");

                    if(media < 5){
                        System.out.println("Reprovado otário !");
                    } else if (media >= 5.1 && media <= 6.9){
                        System.out.println("De recuperação otário !");
                    } else if (media >= 7.0){
                        System.out.println("Parabéns, não fez mais do que sua obrigação.");
                    }
                break;
            }
        }
    }
}
