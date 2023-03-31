public class HelloWorld1{

    public static void main(String[] args){
        /* System.out.print("Mi amigo," + args[0] + " " + args[1] +" estás bien ?"  ); */
        String ambiente = args[0];
            if(ambiente.equals("DEV")){
                System.out.print("Executando em Dev");
            } else if(ambiente.equals("TESTE")){
                System.out.print("Executando em Teste");

            }else {
                System.out.print("blob");
            }
    }

}