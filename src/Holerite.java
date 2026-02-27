public class Holerite {
    private final Funcionario funcionario;
    private final Cargo cargo;
    private final double salarioBruto;
    private final double imposto;
    private final double salarioLiquido;

    public Holerite(Funcionario funcionario, Cargo cargo, double salarioBruto, double imposto, double salarioLiquido) {
        this.funcionario = funcionario;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.salarioLiquido = salarioLiquido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public double getImposto() {
        return imposto;
    }
}