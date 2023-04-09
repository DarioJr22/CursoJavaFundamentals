package C_Boxing_autoBoxing_unboxing_casting;

public class AtividadeCasting {

    private int codigo = 0;

    public static void main(String args[]){
        AtividadeCasting.convetion(2);
        System.out.println(AtividadeCasting.convetion(2));
    }

    private static void convertion(int i) {
    }

    public static Integer convetion(int codigo){
       codigo = (Integer) codigo;
        return codigo;
    }


}
