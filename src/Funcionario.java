import java.util.*;

public class Funcionario {
    private String primeiroNome;
    private String segundoNome;
    private String contaBancaria;
    private String endereco;
    private Date dataEntrada;
    private Date dataSaida;
    private Date dataNascimento;

    public Funcionario(String primeiroNome, String segundoNome, String contaBancaria, String endereco, Date dataEntrada,
                       Date dataSaida, Date dataNascimento) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.endereco = endereco;
        this.contaBancaria = contaBancaria;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.dataNascimento = dataNascimento;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}