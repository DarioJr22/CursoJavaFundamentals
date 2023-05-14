package br.com.dario.domain.dao;

import br.com.dario.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDao implements IClienteDao{
    private Map<Long, Cliente> map;

    public ClienteMapDao(){
        this.map = new HashMap<>();

    };


    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastro = this.map.get(cpf);
        if(clienteCadastro != null){
            this.map.remove(clienteCadastro.getCpf(),clienteCadastro);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastro = this.map.get(cliente.getCpf());
        if(clienteCadastro != null){
            clienteCadastro.setNome(cliente.getNome());
            clienteCadastro.setTel(cliente.getTel());
            clienteCadastro.setNumero(cliente.getNumero());
            clienteCadastro.setEnd(cliente.getEnd());
            clienteCadastro.setCidade(cliente.getCidade());
            clienteCadastro.setEstado(cliente.getEstado());
        }

    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
