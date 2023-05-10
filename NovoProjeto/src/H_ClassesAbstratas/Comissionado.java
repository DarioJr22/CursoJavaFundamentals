package H_ClassesAbstratas;

public class Comissionado extends Empregado{

    private double vendas;

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getTaxadeComissao() {
        return taxadeComissao;
    }

    public void setTaxadeComissao(double taxadeComissao) {
        this.taxadeComissao = taxadeComissao;
    }

    private double taxadeComissao;
    @Override
    public double vencimento() {
        return 0;
    }
}
