public class SaidaRelatorio {
    public void imprimir(Holerite h) {
        System.out.println("          HOLERITE MENSAL           ");
        System.out.println("Funcionário: " + h.getFuncionario().getPrimeiroNome() + " " + h.getFuncionario().getSegundoNome());
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", h.getSalarioLiquido()));
    }
}