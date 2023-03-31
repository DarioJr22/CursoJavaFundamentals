public class PrimeiraClasse {
    public static void main(String args[]){

        System.out.println();

       Cliente cliente = new Cliente();

       cliente.cadastrarEndereco("Av. Guararapes 132");

       System.out.println("Olá Dário, seu endereço é o " + cliente.getEndereco() +" ?");

       cliente.setCodigo(2);

       System.out.println("Seu código é o " + cliente.getCodigo());


    }
}
