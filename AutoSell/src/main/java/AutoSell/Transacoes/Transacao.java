package AutoSell.Transacoes;

import java.util.Date;

public class Transacao {
    int valor;
    String data;
    String tipo;

    public Transacao(int valor, String data, String tipo) {
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
