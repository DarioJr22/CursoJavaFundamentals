package B_Variaveis_Tipos_Operadores;

public class Operacoes {
    public static void main(String args[]){
    operacoesAritimeticas();
    operacoesAtributivas();
    operacoesIncrementoDecremento();
    operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("***Operações Relacionais***");

        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        boolean isIgual = num1 == num2;
        boolean isDiff = num1 != num2;
        boolean isMaiorOuIgual = num1 >= num2;

        System.out.println("IsMaior " + isMaior);
        System.out.println("isIgual " + isIgual);
        System.out.println("isDiff " + isDiff);
        System.out.println("isMaiorOuIgual " + isMaiorOuIgual);

        System.out.println("***Operações Relacionais - &&, ||  ***");

        boolean ou = num1 > 8 || num2 < 12;
        boolean e = num1 == num2 && num2 >= num1;


        System.out.println("And " + e);
        System.out.println("Or " + ou);



    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("***Operações Incremento e Decremento***");

        int num1 = 10;
        num1++;
        System.out.println("Incremento " + num1);
        num1--;
        num1--;
        System.out.println("Decremento " + num1);

    }

    private static void operacoesAtributivas() {
        System.out.println("***Operações Atributivas***");
        int numero1 = 10;
        int numero2 = 23;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        int numero4 = numero3 + 20;
        System.out.println(numero4);

    }


    public static void operacoesAritimeticas(){
        System.out.println("***Operações Aritimeticas***");
        int num = 10;
        int num1 = 20;

        int num3 = num1 + num;
        int num4 = num1 - num;
        int num5 = num1 / num;
        int num6 = num1 * num;
        int num7 = (num1 + num) * 13 /5;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);


    }



}
