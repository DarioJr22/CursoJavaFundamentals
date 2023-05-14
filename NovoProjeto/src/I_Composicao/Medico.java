package I_Composicao;

import java.util.ArrayList;

public class Medico {
    private String nome;
    private ArrayList<String> Especialidades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getEspecialidades() {
        return Especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        Especialidades = especialidades;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String salario) {
        Salario = salario;
    }

    private String Salario;
}
