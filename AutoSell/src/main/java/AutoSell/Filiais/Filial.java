package AutoSell.Filiais;

public class Filial {
    public String nome;
    public String telefone;
    public String email;
    public String morada;
    public String codPostal;
    public String gerente;

    public Filial(String nome, String telefone, String email, String morada, String codPostal, String gerente) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.morada = morada;
        this.codPostal = codPostal;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}
