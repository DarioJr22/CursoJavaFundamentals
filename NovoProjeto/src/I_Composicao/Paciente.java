package I_Composicao;

import java.util.HashSet;
import java.util.Set;
/*
* Exemplo de composição:
*
* Descrição: Composição é a junção de duas figuras: Classe composta e classe componente.
*
* Na classe composta você agrega as classes componentes necessários para compor
* o comportamento esperado.
*
* */
public class Paciente {


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    private Set<HistoricoHospitalar> historico;

    private Set<Medico> medicoResponsavel;

    private Set<Doenca> doencas;



    public Paciente(){
        this.historico = new HashSet<>();
        this.medicoResponsavel = new HashSet<>();
        this.doencas = new HashSet<>();
    }

    public void addHist(HistoricoHospitalar hh){
        this.historico.add(hh);
    }

    public void addMed(Medico md){
        this.medicoResponsavel.add(md);

    }

    public void addDo(Doenca dc){
        this.doencas.add(dc);

    }



}
