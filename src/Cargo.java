public class Cargo {
    private double salario;
    private String nome;
    private String setor;
    private double horasFixas;

    public Cargo(double salario, String nome, String setor, double horasFixas) {
        this.salario = salario;
        this.nome = nome;
        this.setor = setor;
        this.horasFixas = horasFixas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getHorasFixas() {
        return horasFixas;
    }

    public void setHorasFixas(double horasFixas) {
        this.horasFixas = horasFixas;
    }


}