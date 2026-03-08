public class FolhaPagamento {
    private final CalculadorImposto calculadorINSS;
    private final CalculadorImposto calculadorIRPF;

    public FolhaPagamento(CalculadorImposto calculadorINSS, CalculadorImposto calculadorIRPF) {
        this.calculadorINSS = calculadorINSS;
        this.calculadorIRPF = calculadorIRPF;
    }

    public Holerite gerar(Funcionario funcionario, Cargo cargo, Hora horasMes) {
        double valorHora = cargo.getSalario() / cargo.getHorasFixas();
        double valorExtras = horasMes.getHorasExtras() * valorHora;
        double valorFaltas = horasMes.getHorasFaltantes() * valorHora;

        double bruto = cargo.getSalario() + valorExtras - valorFaltas;

        double inss = calculadorINSS.calcular(bruto);
        double baseIRPF = bruto - inss;
        double irpf = calculadorIRPF.calcular(baseIRPF);

        return new Holerite(funcionario, cargo, bruto, inss, irpf, (bruto - inss - irpf));
    }
}