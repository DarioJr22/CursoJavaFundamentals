package G_Interface;

public class Lapis implements Caneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrever o valor" + texto + "na classe" + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Azul";
    }
}
