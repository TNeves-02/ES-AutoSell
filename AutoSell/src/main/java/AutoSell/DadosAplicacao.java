package AutoSell;

import AutoSell.Clientes.Cliente;
import AutoSell.Filiais.Filial;
import AutoSell.Pecas.Peca;
import AutoSell.Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DadosAplicacao {
    public static DadosAplicacao INSTANCE = new DadosAplicacao();

    private final LinkedList<Cliente> clientes;
    private final LinkedList<Filial> filiais;
    private final LinkedList<Veiculo> veiculos;
    private final LinkedList<Peca> pecas;



    public DadosAplicacao() {
        clientes = new LinkedList<>();
        filiais = new LinkedList<>();
        veiculos = new LinkedList<>();
        pecas = new LinkedList<>();
    }

    //////////////////////////////////Veiculos///////////////////////////////////////
    public LinkedList<Veiculo> getVeiculos() {
        return veiculos;
    }
    public boolean adicionarVeiculo(Veiculo veiculo){
        if(veiculo == null || veiculos.contains(veiculo)){
            return false;
        }
        veiculos.add(veiculo);
        return true;
    }

    //////////////////////////////////Clientes///////////////////////////////////////
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

    /////////////////////////////////Filiais//////////////////////////////////
    public boolean adicionarFilial(Filial filial) {
        if(filial == null || filiais.contains(filial)){
            return false;
        }
        for (Filial filial1 : filiais) {
            if (filial1.getNome().equals(filial.getNome())) {
                return false;
            }
        }
        filiais.add(filial);
        return true;
    }

    public LinkedList<Filial> getFiliais() {
        return new LinkedList<>(filiais);
    }

    public void eliminarFilial(int index) {
        filiais.remove(index);
    }

    public boolean editarFilial(Filial filial) {
        if (filial == null){
            return false;
        }
        for (Filial filial1 : filiais) {

            if (filial1.getNome().equals(filial.getNome())) {
                filial1.setTelefone(filial.getTelefone());
                filial1.setEmail(filial.getEmail());
                filial1.setMorada(filial.getMorada());
                filial1.setCodPostal(filial.getCodPostal());
                filial1.setGerente(filial.getGerente());
            }
        }
        return true;
    }
    /////////////////////////////////Peças//////////////////////////////////
    public boolean adicionarPeca(Peca peca) {
        if(peca == null || pecas.contains(peca)){
            return false;
        }
        for (Peca peca1 : pecas) {
            if (peca1.getReferencia().equals(peca.getReferencia())) {
                return false;
            }
        }
        pecas.add(peca);
        return true;
    }

    public LinkedList<Peca> getPecas() {
        return new LinkedList<>(pecas);
    }
}
