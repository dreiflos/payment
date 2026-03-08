public class ModalidadeComissionado implements Modalidade{

    private static final double percentualComissao = 0.03;

    @Override
    public double calcularSalarioBruto(double salario, double metaVendas, double vendasRealizadas) {
        double comissao = vendasRealizadas * percentualComissao;
        double totalComComissao = salario + comissao;
        return Math.max(salario, totalComComissao);
    }

    @Override
    public String getModalidade() {
        return "Comissionado";
    }

    @Override
    public String getDescricaoEncargos(double salario) {
        return String.format(
                "Modalidade Comissionado, Comissão: 3% sobre vendas, Salário bruto final: R$ %.2f",
                salario
        );
    }
}