package Classes_Metodos_PalavrasReservadas_ModificadoresAcesso;/*
* @author Dário.Montair
* @see
*
*
*
*
* */

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;

    /*
     *Getters e Setters
     * @params Pega o código do cliente.
     * @return resonator o indigo do client
     * Ao ultilizar uma variável com o mesmo nome que o
     * */
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

}
