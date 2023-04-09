package D_Controle_de_fluxo;

import java.util.Scanner;

public class ControleFluxoSwitchCase {
    public static void main(String args[]){

        System.out.println("***Calculadora de IMC***");
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu peso(KG): ");
        float result = s.nextFloat();
        System.out.println("Digite sua altura(M): ");
        float result2 = s.nextFloat();
        float imc = result / (result2 * result2) ;
        System.out.println("Seu IMC é " + imc);

        switch ((int) imc){
            case 16:
                System.out.println("Sua classificação é Magreza Frau III");
                break;
            default:
                System.out.println("sla man");

        }
     /*   if(){

        } else if (imc >= 16.0 && imc <= 16.9){
            System.out.println("Sua classificação é Magreza Frau II");
        } else if (imc >= 17.0 && imc <= 18.4){
            System.out.println("Sua classificação é Magreza Frau I");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Sua classificação é Adequado");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sua classificação é Pré-Obeso");
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Sua classificação é Obesidade Grau I");
        }else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Sua classificação é Obesidade Grau II");
        }else if (imc >= 40.0){
            System.out.println("Sua classificação é Obesidade Grau III");
        }

      */
    }
}
