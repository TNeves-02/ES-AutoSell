package AutoSell;

import AutoSell.Clientes.Cliente;
import AutoSell.Eventos.Evento;
import AutoSell.Filiais.Filial;
import AutoSell.Pecas.Peca;
import AutoSell.Sede.Sede;
import AutoSell.Transacoes.Transacao;
import AutoSell.Utilizadores.Utilizador;
import AutoSell.Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DadosAplicacao {
    public static DadosAplicacao INSTANCE = new DadosAplicacao();

    private final LinkedList<Cliente> clientes;
    private final LinkedList<Filial> filiais;
    private final LinkedList<Sede> sedes;
    private final LinkedList<Utilizador> utilizadores;
    private final LinkedList<Veiculo> veiculos;
    private final LinkedList<Peca> pecas;
    private final LinkedList<Transacao> transacoes;
    private final LinkedList<Evento> eventos;



    public DadosAplicacao() {
        clientes = new LinkedList<>();
        filiais = new LinkedList<>();
        veiculos = new LinkedList<>();
        pecas = new LinkedList<>();
        sedes = new LinkedList<>();
        utilizadores = new LinkedList<>();
        transacoes = new LinkedList<>();
        eventos = new LinkedList<>();
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
        return pecas;
    }

    public void eliminarPeca(int index) {
        pecas.remove(index);
    }

    public boolean editarPeca(Peca peca) {
        if (peca == null){
            return false;
        }
        for (Peca peca1 : pecas) {
            if (peca1.getReferencia().equals(peca.getReferencia())) {
                peca1.setNome(peca.getNome());
                peca1.setMarca(peca.getMarca());
                peca1.setDestino(peca.getDestino());
                peca1.setQuantidade(peca.getQuantidade());
                peca1.setVeiculo(peca.getVeiculo());
            }
        }
        return true;
    }

    public boolean adicionarSede(Sede sede) {
        if(sede == null || sedes.contains(sede)){
            return false;
        }
        for (Sede sede1 : sedes) {
            if (sede1.getNome().equals(sede.getNome())) {
                return false;
            }
        }
        sedes.add(sede);
        return true;
    }

    public boolean adicionarUtilizador(Utilizador utilizador) {
        if(utilizador == null || utilizadores.contains(utilizador)){
            return false;
        }
        for (Utilizador user : utilizadores) {
            if (user.getUsername().equals(utilizador.getUsername())) {
                return false;
            }
        }
        utilizadores.add(utilizador);
        return true;
    }

    public Utilizador getUtilizador(String username) {
        for (Utilizador utilizador : utilizadores) {
            if (utilizador.getUsername().equals(username)) {
                return utilizador;
            }
        }
        return null;
    }

    public boolean adicionarTransacao(Transacao transacao) {
        if(transacao == null || transacoes.contains(transacao)){
            return false;
        }
        transacoes.add(transacao);
        return true;
    }

    public List<Transacao> getTransacoes() {
        return new LinkedList<>(transacoes);
    }

    public Veiculo getVeiculo(String matricula) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getMatricula().equals(matricula)) {
                return veiculo;
            }
        }
        return null;
    }

    public void venderVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public boolean adicionarEvento(Evento evento)
    {
        if(evento == null || eventos.contains(evento))
        {
            return false;
        }
        eventos.add(evento);
        return true;
    }

    public List<Evento> getEventos() {
        return new LinkedList<>(eventos);
    }

    public Evento getEvento(String nome)
    {
        for (Evento evento : eventos){
            if (evento.getNome().equals(nome)) {
                return evento;
            }
        }
        return null;
    }

    public LinkedList<Evento> getEventosDiponiveis() {
        LinkedList<Evento> even = new LinkedList<>();
        for (Evento evento : eventos)
        {
            if(evento.getEstado().equals("Pendente"))
            {
                even.add(evento);
            }
        }
        return even;
    }

    public boolean cancelarEvento(String nomeEvento) {
        for (Evento evento : eventos)
        {
            if(evento.getEstado().equals("Pendente") && evento.getNome().equals(nomeEvento))
            {
                evento.setEstado("Cancelado");
                return true;
            }
        }
        return false;
    }
}
