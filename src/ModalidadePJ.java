public class ModalidadePJ implements Modalidade {
    private static final double iss = 0.05;
    private static final double simples = 0.06;

    @Override
    public double calcularSalarioBruto(double salario, double horasFixas, double horasTrabalhadas) {
        return salario;
    }

    @Override
    public String getModalidade() {
        return "PJ";
    }

    public String getDescricaoEncargos(double salario) {
        double encargoIss = salario * iss;
        double encargoSimples = salario * simples;
        double totalEncargos = encargoIss + encargoSimples;

        return String.format(
                "Modalidade PJ, ISS: R$ %.2f (5%), Simples Nacional: R$ %.2f (6%), Total encargos: R$ %.2f",
                encargoIss, encargoSimples, totalEncargos
        );
    }
}
