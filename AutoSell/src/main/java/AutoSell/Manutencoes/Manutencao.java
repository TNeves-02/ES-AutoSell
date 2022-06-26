package AutoSell.Manutencoes;

import AutoSell.Pecas.Peca;
import AutoSell.Veiculos.Veiculo;

import java.util.LinkedList;

public class Manutencao {
    public Veiculo veiculo;
    public LinkedList<Peca> pecas;

    public Manutencao(Veiculo veiculo, LinkedList<Peca> pecas) {
        this.veiculo = veiculo;
        pecas = new LinkedList<>();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LinkedList<Peca> getPecas() {
        return pecas;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setPecas(LinkedList<Peca> pecas) {
        this.pecas = pecas;
    }
}
