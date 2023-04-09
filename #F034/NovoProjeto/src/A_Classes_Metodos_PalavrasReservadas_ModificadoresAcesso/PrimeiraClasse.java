package A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso;

public class PrimeiraClasse {
    public static void main(String args[]){

        System.out.println();

       Cliente cliente = new Cliente();
       Funcionario func = new Funcionario();


       func.setNome("Fulano de tal");
       cliente.cadastrarEndereco("Av. Guararapes 132");

       System.out.println("Olá Dário, seu endereço é o " + cliente.getEndereco() +" ?");
       System.out.println("O funcionário que irá lhe atender é o " + func.getNome());

       cliente.setCodigo(2);

       System.out.println("Seu código é o " + cliente.getCodigo());


    }
}
