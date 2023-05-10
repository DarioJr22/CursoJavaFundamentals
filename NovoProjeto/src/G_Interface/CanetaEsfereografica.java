package G_Interface;

public class CanetaEsfereografica implements Caneta{

    @Override
    public String getCor() {
        return "Azul";
    }

    @Override
    public void escrever(String texto){
        System.out.println("Escrever o valor" + texto + "na classe" + getClass().getSimpleName());

    }
}
