package H_ClassesAbstratas;

import java.util.Scanner;

public class Softw {

    public static void main(String[] arg){
        Assalariado empregado = new Assalariado();
        Scanner s = new Scanner(System.in);
        System.out.println("Qual nome do seu empregado ?");
        String nome = s.next();
        System.out.println("Qual CPF do seu empregado ?");
        String cpf = s.next();
        System.out.println("Qual SALARIO do seu empregado ?");
        Double sal = s.nextDouble();
        empregado.setNome(nome);
        empregado.setSalario(sal);
        empregado.setCpf(cpf);

        System.out.println(empregado.getNome());
        System.out.println(empregado.getCpf());
        System.out.println(empregado.getSalario());



    }
}
