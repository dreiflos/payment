public class Imposto2025 implements CalculadorImposto {
    private static final double faixa1 = 1518.00;
    private static final double faixa2 = 2793.88;
    private static final double faixa3 = 4190.83;
    private static final double teto = 8157.41;
    private static final double tetoDesconto = 951.64;

    private static final double desconto1 = 0.075;
    private static final double desconto2 = 0.09;
    private static final double desconto3 = 0.12;
    private static final double desconto4 = 0.14;

    @Override
    public double calcular(double salarioBruto) {
        // se o salario for maior que o teto, o resultado é o teto, se não é o salario
    double baseCalculo = Math.min(salarioBruto, teto);
    double totalInss;

    if (baseCalculo <= faixa1){
        totalInss = baseCalculo * desconto1;
    } else if (baseCalculo <= faixa2) {
        totalInss = faixa1 * desconto1;
        totalInss += (baseCalculo - faixa1) * desconto2;
    }else if (baseCalculo <= faixa3){
        totalInss = faixa1 * desconto1;
        totalInss += (faixa2 - faixa1) * desconto2;
        totalInss += (baseCalculo - faixa2) * desconto3;
    }else{
        totalInss = faixa1 * desconto1;
        totalInss += (faixa2 - faixa1) * desconto2;
        totalInss += (faixa3 - faixa2) * desconto3;
        totalInss += (baseCalculo - faixa3) * desconto4;
    }
    return Math.min(totalInss, tetoDesconto);
    }

    @Override
    public String getDescricao(){
        return "INSS 2025 - 7,5% A 14% | Teto: R$ 951,64";
    }
}