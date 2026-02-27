public class FolhaPagamento {
    private final CalculadorImposto calculadorImposto;

    public FolhaPagamento(CalculadorImposto calculadorImposto) {
        this.calculadorImposto = calculadorImposto;
    }

    public Holerite gerar(Funcionario funcionario, Cargo cargo, Hora horasMes) {
        double valorHora = cargo.getSalario() / cargo.getHorasFixas();
        double valorExtras = horasMes.getHorasExtras() * valorHora;
        double valorFaltas = horasMes.getHorasFaltantes() * valorHora;

        double bruto = cargo.getSalario() + valorExtras - valorFaltas;
        double imposto = calculadorImposto.calcular(bruto);

        return new Holerite(funcionario, cargo, bruto, imposto, (bruto - imposto));
    }
}
