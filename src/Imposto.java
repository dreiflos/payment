public class Imposto implements CalculadorImposto {
    @Override
    public double calcular(double salarioBruto) {
        if (salarioBruto <= 1412) return salarioBruto * 0.075;
        if (salarioBruto <= 2666.68) return salarioBruto * 0.09;
        if (salarioBruto <= 4000.03) return salarioBruto * 0.12;
        return salarioBruto * 0.14;
    }
}