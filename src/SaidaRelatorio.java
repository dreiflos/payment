public class SaidaRelatorio {
    public void imprimir(Holerite h) {
        System.out.println("               HOLERITE MENSAL                     ");
        System.out.println("Funcionário  : " + h.getFuncionario().getPrimeiroNome() + " " + h.getFuncionario().getSegundoNome());
        System.out.println("Cargo        : " + h.getCargo().getNome());
        System.out.println("----------------------------------------------------");
        System.out.printf("Salário Bruto: R$ %.2f%n", h.getSalarioBruto());
        System.out.printf("Desconto INSS: R$ %.2f%n", h.getInss());
        System.out.printf("Desconto IRPF: R$ %.2f%n", h.getIrpf());
        System.out.println("----------------------------------------------------");
        System.out.printf("LÍQUIDO: R$ %.2f%n", h.getSalarioLiquido());
        System.out.println();
    }
}