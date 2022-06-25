package AutoSell;

import AutoSell.Clientes.Cliente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DadosAplicacao {
    public static DadosAplicacao INSTANCE = new DadosAplicacao();

    private final LinkedList<Cliente> clientes;

    public DadosAplicacao() {
        clientes = new LinkedList<>();
    }

    public boolean adicionarCliente(Cliente cliente){
        if(cliente == null ){
            return false;
        }

        for (Cliente cliente1 : clientes) {
            if (cliente1.getNif().equals(cliente.getNif())) {
                return false;
            }
        }


        clientes.add(cliente);
        return true;
    }

    public LinkedList<Cliente> getClientes() {
        return new LinkedList<>(clientes);
    }

    public boolean editarCliente(Cliente cliente) {
        if (cliente == null){
            return false;
        }
        for (Cliente cliente1 : clientes) {

            if (cliente1.getNif().equals(cliente.getNif())) {
                cliente1.setNome(cliente.getNome());
                cliente1.setTelefone(cliente.getTelefone());
                cliente1.setEmail(cliente.getEmail());
                cliente1.setMorada(cliente.getMorada());
                cliente1.setCodPostal(cliente.getCodPostal());
            }
        }
        return true;
    }

    public void eliminarCliente(int index){
        clientes.remove(index);
    }
}
