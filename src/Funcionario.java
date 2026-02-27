import java.time.LocalDate;

public class Funcionario {
    private String primeiroNome;
    private String segundoNome;
    private String contaBancaria;
    private String endereco;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private LocalDate dataNascimento;

    public Funcionario(String primeiroNome, String segundoNome, String contaBancaria, String endereco, LocalDate dataEntrada,
                       LocalDate dataSaida, LocalDate dataNascimento) {
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}