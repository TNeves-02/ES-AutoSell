package AutoSell.Pecas;

public class Peca {
    public String nome;
    public String referencia;
    public String marca;
    public int quantidade;
    public String destino;
    public String veiculo;
    public String quantSede;
    public String quantFilial;

    public Peca(String nome, String referencia, String marca, int quantidade, String destino, String veiculo) {
        this.nome = nome;
        this.referencia = referencia;
        this.marca = marca;
        this.quantidade = quantidade;
        this.destino = destino;
        if (destino.equals("Sede")){
            quantSede= quantidade+"/"+destino;
            quantFilial = "0";
        }
        else {
            quantSede= "0";
            quantFilial = quantidade+"/"+destino;
        }
        this.veiculo = veiculo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDestino(String destino) {
        if (destino.equals("Sede")){
            quantSede= quantidade+"/"+destino;
            quantFilial = "0";
        }
        else {
            quantSede= "0";
            quantFilial = quantidade+"/"+destino;
        }
        this.destino = destino;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDestino() {
        return destino;
    }

    public String getVeiculo() {
        return veiculo;
    }


}
