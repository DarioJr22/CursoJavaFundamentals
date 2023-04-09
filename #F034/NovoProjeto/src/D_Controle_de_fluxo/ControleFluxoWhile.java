package D_Controle_de_fluxo;

public class ControleFluxoWhile {

    public static void main(String args[]){
        int count = 0;
        while (count < 2){
            System.out.println("Pare na repetição nr: " + count);
            count++;
        }


       do{
           System.out.println("Do While");
           System.out.println("Pare na repetição nr: " + count);
           count++;
       }while(count < 5);
    }
}
