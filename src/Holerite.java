public class Holerite {
    private final Funcionario funcionario;
    private final Cargo cargo;
    private final double salarioBruto;
    private final double inss;
    private final double irpf;
    private final double salarioLiquido;

    public Holerite(Funcionario funcionario, Cargo cargo, double salarioBruto, double inss, double irpf, double salarioLiquido) {
        this.funcionario = funcionario;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.inss = inss;
        this.irpf = irpf;
        this.salarioLiquido = salarioLiquido;
    }

    public Funcionario getFuncionario() { return funcionario; }
    public Cargo getCargo() { return cargo; }
    public double getSalarioBruto() { return salarioBruto; }
    public double getInss() { return inss; }
    public double getIrpf() { return irpf; }
    public double getImposto() { return inss + irpf; }
    public double getSalarioLiquido() { return salarioLiquido; }
}