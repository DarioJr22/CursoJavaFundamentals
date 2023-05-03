package A_Classes_Metodos_PalavrasReservadas_ModificadoresAcesso;/*
* @author Dário.Montair
* @see
*
*
*
*
* */

import java.util.Objects;

public class Cliente implements Comparable<Cliente>{
    private Double codigo;
    private String nome;
    private String endereco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codigo, cliente.codigo) && Objects.equals(nome, cliente.nome) && Objects.equals(endereco, cliente.endereco) && Objects.equals(produto, cliente.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, endereco, produto);
    }

    private String produto;

    /*
    * Construtor
    *
    * */

    public Cliente(
      String nome,
      String produto,
      String endereco,
      Double codigo
    ){
        this.nome = nome;
        this.produto = produto;
        this.endereco = endereco;
        this.codigo = codigo;
    }


    public String toString() {
        return this.nome;
    }

    /*
     *Getters e Setters
     * @params Pega o código do cliente.
     * @return resonator o indigo do client
     * Ao ultilizar uma variável com o mesmo nome que o
     * */
    public Double getCodigo(){
        return codigo;
    }

    public void setCodigo(Double codigo){
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


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.nome.compareTo(cliente.getNome());
    }
}
