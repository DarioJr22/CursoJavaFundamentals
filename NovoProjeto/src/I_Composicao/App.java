package I_Composicao;

import java.util.Scanner;

public class App {

    public static void main(String args[]){
    System.out.println("--- Prontuário de Entrada ---");
    Scanner s = new Scanner(System.in);
    Paciente p = new Paciente();
    Medico m = new Medico();
    Doenca d = new Doenca();




        System.out.println("--- Nome do Paciente ---");
        p.setNome(s.next());
        System.out.println("--- Medico ---");
        m.setNome(s.next());
        System.out.println("--- Doenca ---");
        d.setNome(s.next());

        System.out.println("--- Saída:Paciente  ---"+ p.getNome() + " ");
        System.out.println("--- Saída:Médico  ---"+ m.getNome() + " ");
        System.out.println("--- Saída:Doenca  ---"+ d.getNome() + " ");








    }



}
