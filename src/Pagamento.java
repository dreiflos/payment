public class Pagamento {
    private Funcionario funcionario;
    private Cargo cargo;
    private Hora horasMes;
    private Imposto calcular = new Imposto();

    public Pagamento (Funcionario funcionario, Cargo cargo, Hora horasMes) {
        this.cargo = cargo;
        this.funcionario = funcionario;
        this.horasMes = horasMes;
    }

    public void gerarHolerite() {
        String nomeCompleto = funcionario.getPrimeiroNome() + " " + funcionario.getSegundoNome();
        String nomeCargo = cargo.getNome();
        double salario = cargo.getSalario();
        double horasFixas = cargo.getHorasFixas();

        double valorHora = salario / horasFixas;

        double valorExtras = horasMes.getHorasExtras() * valorHora;
        double valorFaltas = horasMes.getHorasFaltantes() * valorHora;

        double salarioBruto = salario + valorExtras - valorFaltas;

        double desconto = calcular.calcular(salarioBruto);

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("          HOLERITE MENSAL           ");
        System.out.println("Funcionário: " + nomeCompleto);
        System.out.println("Cargo: " + nomeCargo);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salario) + " (" + horasFixas + "h)");
        System.out.println("------------------------------------");
        System.out.println("Horas Extras (" + horasMes.getHorasExtras() + "h): + R$ " + String.format("%.2f", valorExtras));
        System.out.println("Faltas (" + horasMes.getHorasFaltantes() + "h): - R$ " + String.format("%.2f", valorFaltas));
        System.out.println("Salário Bruto Calculado: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Desconto Imposto: R$ " + String.format("%.2f", desconto));
        System.out.println("------------------------------------");
        System.out.println("SALÁRIO LÍQUIDO A RECEBER: R$ " + String.format("%.2f", salarioLiquido));
    }
}