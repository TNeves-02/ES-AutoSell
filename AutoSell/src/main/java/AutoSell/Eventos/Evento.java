package AutoSell.Eventos;

import AutoSell.Veiculos.Veiculo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Evento {
    String nome;
    String dataInicio;
    String dataFim;
    Boolean filial;
    String localEvento;
    LinkedList<Veiculo> veiculos;
    String estado;

    public Evento(String nome, String dataInicio, String dataFim, Boolean filial, String localEvento, String estado) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.filial = filial;
        this.localEvento = localEvento;
        this.estado = estado;
        veiculos = new LinkedList<>();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Boolean getFilial() {
        return filial;
    }

    public void setFilial(Boolean filial) {
        this.filial = filial;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public LinkedList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(LinkedList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo)
    {
        veiculos.remove(veiculo);
    }
}
