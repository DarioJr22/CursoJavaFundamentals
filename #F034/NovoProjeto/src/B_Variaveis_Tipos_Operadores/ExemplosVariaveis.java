package B_Variaveis_Tipos_Operadores;

/*
* Escopo de variáveis >
*
* Variáveis declaradas globalmente dentro de uma classe especifica, podem ser manipuladas dentro dos métodos dessas classes
* Porém, variáveis de métodos não podem ser manipuladas globalmente. Isso acontece devido ao escopo das variáveis.
*
*
*
* */
public class ExemplosVariaveis {

    /*
    *  Construtor
    *
    *  */

    public ExemplosVariaveis (){

    }

    public ExemplosVariaveis(int num){
        this.codigo = num;
    }
    private int codigo = 1;

    private long codigoMaior = 10213;

    private float valorDecimal = 10.2f;

    private double valorDecimal1=10.2;

    private String texto = "Cryst";

    private short shorts;

    private byte kb;


    public String returnText(){
        return texto;
    }

    public int returnInteiro(){
        this.codigo = 0;
        int val = 20;
        return codigo + val;
    }


}
