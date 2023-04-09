package C_Boxing_autoBoxing_unboxing_casting;

/*
* A ultilização Wrappers são classes que representam os tipos primitivos, porém com atributos
* e metodos que cobrem mais necessidades.
*
* Boxing ou AutoBoxing é o ato de você declarar valores assim que se inicializa uma classe wrapper
*
* unboxing é você converter um valor para o tipo correspondnte primitivo
*
* casting é a conversão de tipos
*
* */
public class Cliente {

    private Integer codigo = 1;

    private Long codigoMaior = 211333121132123L;


    private Float valorDecimal = 10.2f;

    private Double valorDecimal1=10.2231231231122222222222222222222222222222222222222;

    private Byte bi;

    private Character letra = 'A';



    public static void main(String args[]){
        /*
         * Casting Explicitos
         * */

        int num1 = 10;
        int num2 = (Integer) num1;


    }







}
