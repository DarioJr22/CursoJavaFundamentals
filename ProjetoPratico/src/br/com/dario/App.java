package br.com.dario;

import br.com.dario.domain.Cliente;
import br.com.dario.domain.dao.ClienteMapDao;
import br.com.dario.domain.dao.IClienteDao;

import javax.swing.*;

public class App {


    private static IClienteDao iClienteDao;
    public static void main(String[] args){
        iClienteDao = new ClienteMapDao();

        String opcao = JOptionPane.showInputDialog(null,
                "1 - Cadastro; /n 2 - Consulta /n 3 - Exclusão /n 4 - Alteração /n ","Cadastro",
                JOptionPane.INFORMATION_MESSAGE);
        while(!isOpcaoValida(opcao)){
            if("".equals(opcao)){
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "1 - Cadastro; /n 2 - Consulta /n 3 - Exclusão /n 4 - Alteração /n ","Cadastro",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOpcaoValida(opcao)){
            if(isOpcaoSair(opcao)){
                sair();
            } else if (isOpcaoCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite OS dados separados por virgula. Exemplo: Cpf, Data, carro","Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if(isConsultar(opcao)){
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF","Consulta",
                        JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            }
        }

    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDao.consultar(Long.parseLong(dados));
        if (cliente != null){
            JOptionPane.showMessageDialog(null,
                    "Cliente: " + cliente.toString(),"Consulta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado","Consulta",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void cadastrar(String dados) {
        String [] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        //Validar s
        Boolean isCadastrado = iClienteDao.cadastrar(cliente);

        if (isCadastrado){
            JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso"
            );
        }else{

            JOptionPane.showMessageDialog(null,
                    "Cliente já cadastrado"
            );

        }
    }

    private static boolean isOpcaoCadastro(String opcao) {
        if("1".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if("2".equals(opcao)){
            return true;
        }
        return false;
    };

    private static boolean isAlterar(String opcao){
        if("3".equals(opcao)){
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }


}
