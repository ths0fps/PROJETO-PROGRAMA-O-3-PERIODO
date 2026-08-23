package repository;

import java.util.HashMap;
import java.util.Map;
import model.Cliente;

public class GerenciadorClientes {
    
    private Map<String, Cliente> clientes;

    public GerenciadorClientes(){
        clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarClientePorCpf(String cpf){
        return clientes.get(cpf);
    }

    public void listarClientes(){
        System.out.println("==================Clientes=============");
        for (Cliente cliente: clientes.values()){
            cliente.exibirInformacoes();
            System.out.println();
        }
    }
}
