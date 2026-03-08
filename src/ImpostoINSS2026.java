public class ImpostoINSS2026 implements CalculadorImposto {
    private static final double faixa1 = 1621.00;
    private static final double faixa2 = 2902.84;
    private static final double faixa3 = 4354.27;
    private static final double teto = 8475.55;
    private static final double tetoDesconto = 988.09;

    private static final double desconto1 = 0.075;
    private static final double desconto2 = 0.09;
    private static final double desconto3 = 0.12;
    private static final double desconto4 = 0.14;

    public double calcular(double salarioBruto){
        double baseCalculo = Math.min(salarioBruto, teto);
        double totalInss;
        if(baseCalculo <= faixa1){
            totalInss = baseCalculo * faixa1;
        } else if(baseCalculo<= faixa2){
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
        return "INSS 2026 - 7,5% A 14% | Teto: R$ 988,09";
    }
}
