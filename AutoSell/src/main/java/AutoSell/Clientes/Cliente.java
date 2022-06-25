package AutoSell.Clientes;

public class Cliente {
    public String nome;
    public String telefone;
    public String email;
    public String nif;
    public String morada;
    public String codPostal;

    public Cliente(String nome, String telefone, String email, String nif, String morada, String codPostal) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nif = nif;
        this.morada = morada;
        this.codPostal = codPostal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNif() {
        return nif;
    }

    public String getMorada() {
        return morada;
    }

    public String getCodPostal() {
        return codPostal;
    }
}
