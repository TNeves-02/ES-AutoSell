package AutoSell.Veiculos;

public class Veiculo {
    public String matricula;
    public String modelo;
    public String marca;
    public String donoAnterior;
    public int nDonos;
    public String combustivel;
    public Boolean acidentes;
    public String caracteristicas;




    public Veiculo(String matricula, String modelo, String marca, String donoAnterior, int nDonos, String combustivel, Boolean acidentes, String caracteristicas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.donoAnterior = donoAnterior;
        this.nDonos = nDonos;
        this.combustivel = combustivel;
        this.acidentes = acidentes;
        this.caracteristicas = caracteristicas;
    }

    public Boolean getAcidentes() {
        return acidentes;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getDonoAnterior() {
        return donoAnterior;
    }

    public int getnDonos() {
        return nDonos;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDonoAnterior(String donoAnterior) {
        this.donoAnterior = donoAnterior;
    }

    public void setnDonos(int nDonos) {
        this.nDonos = nDonos;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setAcidentes(Boolean acidentes) {
        this.acidentes = acidentes;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
