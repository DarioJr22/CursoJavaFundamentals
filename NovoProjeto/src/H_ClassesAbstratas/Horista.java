package H_ClassesAbstratas;

public class Horista extends Empregado{
    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    private double precoHora;
    private double horasTrabalhadas;

    @Override
    public double vencimento(){
        return 40028922;
    }
}
