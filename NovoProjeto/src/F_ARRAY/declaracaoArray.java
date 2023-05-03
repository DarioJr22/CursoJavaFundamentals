package F_ARRAY;

public class declaracaoArray {
   public static void main(String args[]){
       int [][] array1 = {{1,3,5},{2,4,6}};
       int [][] array2 = {{7,9,11}, {8,10,12}};
//       forEachArrayBi(array1);
//       forEachArrayBi(array2);

       BubbleSort();
   }

   private static void declaracaoArray(){
       //Iniciando um array com valores
       int[] a = new int[4];

       //Iniicalizando um array
       int [] b;

       //Adicionando posições á um Array
       b = new int[10];
       int cont = 0;


       //Inicializando valores literais
       int [] inicializandoValores = {10,10,3,4,24};


       //Array List
       b [0] = 1;
       b [1] = 2;
       b [2] = 3;

       //Acesso por posição com ternario
       for (int i = 0; i < b.length; i++){
           int fibonacci = i == 0 ? b[i] : b[i -1] + b[i];
           System.out.println(fibonacci);
       }






   }


    //Array Bi dimensional
    public static void forEachArrayBi(int[][]array){

        for(int i = 0; i < array.length; i++){
            for(int coluna = 0; coluna < array[i].length;coluna++){
                System.out.printf("%d ",array[i][coluna]);
            }
        }
    }

    //BubbleSort Algoritm

    public static void BubbleSort(){
       int[] items = {22000,2,5,2000,23,12,59,209};
       int aux = 0;

       //Array desordenado
        System.out.println("Desordenado");
       for(int i:items){
           System.out.println(i);
       }

       //Array ordenado
        for(int nItem = 0; nItem < items.length ; nItem++ ) {
            for (int i = 0; i < items.length - 1; nItem++) {
                if (items[i] > items[i + 1]) {
                    aux = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = aux;
                }
            }
        }
        System.out.println("Ordenado");
        for(int i:items){
            System.out.println(i);
        }
    }

}
