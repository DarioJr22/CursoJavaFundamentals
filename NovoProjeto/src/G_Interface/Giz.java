package G_Interface;

public class Giz implements Caneta{


    @Override
    public void escrever(String texto) {
        System.out.println("Escrever o valor" + texto + "na classe" + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
