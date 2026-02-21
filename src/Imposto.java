public class Imposto {

    public double calcular (double salario) {
        double salarioComDesconto = 0.0;

        if(salario<= 1412) {
            salarioComDesconto = salario * 0.075;
        } else if (salario > 1412 && salario<= 2666.68) {
            salarioComDesconto = salario * 0.09;
        } else if (salario > 2666.68 && salario < 4000.03) {
            salarioComDesconto = salario * 0.12;
        } else if (salario > 4000.03){
            salarioComDesconto = salario * 0.14;
        }
        return salarioComDesconto;
    }
}