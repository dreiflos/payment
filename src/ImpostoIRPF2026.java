public class ImpostoIRPF2026 implements CalculadorImposto {
    private static final double faixa1 = 2428.80;
    private static final double faixa2 = 2918.61;
    private static final double faixa3 = 3751.05;
    private static final double faixa4 = 4664.68;

    private static final double desconto2 = 0.075;
    private static final double desconto3 = 0.15;
    private static final double desconto4 = 0.225;
    private static final double desconto5 = 0.275;


    private static final double deducaoFaixa2 = 182.16;
    private static final double deducaoFaixa3 = 400.95;
    private static final double deducaoFaixa4 = 662.77;
    private static final double deducaoFaixa5 = 896.00;

    @Override
    public double calcular(double baseCalculo) {
        if (baseCalculo <= faixa1) {
            return 0.0;
        } else if (baseCalculo <= faixa2) {
            return (baseCalculo * desconto2) - deducaoFaixa2;

        } else if (baseCalculo <= faixa3) {
            return (baseCalculo * desconto3) - deducaoFaixa3;

        } else if (baseCalculo <= faixa4) {
            return (baseCalculo * desconto4) - deducaoFaixa4;

        } else {
            return (baseCalculo * desconto5) - deducaoFaixa5;
        }
    }

    @Override
    public String getDescricao() {
        return "IRPF 2026";
    }
}
