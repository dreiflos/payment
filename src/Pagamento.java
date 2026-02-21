public class Pagamento {
    private Funcionario funcionario;
    private Cargo cargo;
    private double horasTrabalhadas;
    private Imposto calcular = new Imposto();

    public Pagamento (Funcionario funcionario, Cargo cargo, double horasTrabalhadas) {
        this.cargo = cargo;
        this.funcionario = funcionario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void gerarHolerite() {
        String nomeCompleto = funcionario.getPrimeiroNome() + " " + funcionario.getSegundoNome();
        String nomeCargo = cargo.getNome();
        double salario = cargo.getSalario();
        double horasFixas = cargo.getHorasFixas();

        double valorHora = salario / horasFixas;

        double saldoHoras = horasTrabalhadas - horasFixas;

        double salarioBruto = salario + (saldoHoras * valorHora);

        double desconto = calcular.calcular(salarioBruto);

        double salarioLiquido = salarioBruto - desconto;


        System.out.println("====================================");
        System.out.println("          HOLERITE MENSAL           ");
        System.out.println("====================================");
        System.out.println("Funcionário: " + nomeCompleto);
        System.out.println("Cargo: " + nomeCargo);
        System.out.println("Salário Base: R$ " + salario + " (" + horasFixas + "h)");
        System.out.println("Horas Realizadas: " + horasTrabalhadas + "h");
        System.out.println("------------------------------------");
        System.out.println("Salário Bruto Calculado: R$ " + salarioBruto);
        System.out.println("Desconto Imposto: R$ " + desconto);
        System.out.println("------------------------------------");
        System.out.println("SALÁRIO LÍQUIDO A RECEBER: R$ " + salarioLiquido);
        System.out.println("====================================");
    }

}
