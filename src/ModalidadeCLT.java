public class ModalidadeCLT implements Modalidade {

    private static final double adicionalHora = 1.50;
    private static final double percentualFgts = 0.08;

    @Override
    public double calcularSalarioBruto(double salario, double horasFixas, double horasTrabalhadas) {
        double valorHora = salario / horasFixas;
        double saldoHoras = horasTrabalhadas - horasFixas;

        if (saldoHoras > 0) {
            return salario + (saldoHoras * valorHora * adicionalHora);
        } else{
            return salario + (saldoHoras * valorHora);
        }
    }

    @Override
    public String getModalidade() {
        return "CLT";
    }

    @Override
    public String getDescricaoEncargos(double salario) {
        double fgts = salario * percentualFgts;
        return String.format(
                "Modalidade CLT, FGTS: R$ %.2f (8%), Horas extras: +50%",
                fgts
        );
    }
}