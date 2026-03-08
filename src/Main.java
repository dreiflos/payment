public class Main {

    public static void main(String[] args) {

        CadFuncionario cadFuncionario = new CadFuncionario();
        CadCargo cadCargo = new CadCargo();

        Cargo cargoAndrei = cadCargo.consultaNome("Desenvolvedor Java JR");
        Funcionario andrei = cadFuncionario.consultaNome("Andrei");

        LancarHoras horasAndrei = new LancarHoras();
        horasAndrei.lancar(10.0, 0.0);
        horasAndrei.lancar(0.0, 3.0);
        Hora horaAndrei = new Hora(horasAndrei.getHorasExtras(), horasAndrei.getHorasFaltantes());

        FolhaPagamento folhaAndrei = new FolhaPagamento(new ImpostoINSS2025(), new ImpostoIRPF2025());
        Holerite holAndrei = folhaAndrei.gerar(andrei, cargoAndrei, horaAndrei);

        SaidaRelatorio relatorio = new SaidaRelatorio();
        relatorio.imprimir(holAndrei);


        Cargo cargoGustavo = cadCargo.consultaNome("Suporte Técnico");
        Funcionario gustavo = cadFuncionario.consultaNome("Gustavo");

        LancarHoras horasGustavo = new LancarHoras();
        horasGustavo.lancar(5.0, 2.0);
        Hora horaGustavo = new Hora(horasGustavo.getHorasExtras(), horasGustavo.getHorasFaltantes());

        FolhaPagamento folhaGustavo = new FolhaPagamento(new ImpostoINSS2026(), new ImpostoIRPF2026());
        Holerite holGustavo = folhaGustavo.gerar(gustavo, cargoGustavo, horaGustavo);

        relatorio.imprimir(holGustavo);


        Cargo cargoAnthony = cadCargo.consultaNome("Administrativo");
        Funcionario anthony = cadFuncionario.consultaNome("Anthony");

        LancarHoras horasAnthony = new LancarHoras();
        horasAnthony.lancar(0.0, 8.0);
        Hora horaAnthony = new Hora(horasAnthony.getHorasExtras(), horasAnthony.getHorasFaltantes());

        FolhaPagamento folhaAnthony = new FolhaPagamento(new ImpostoINSS2025(), new ImpostoIRPF2025());
        Holerite holAnthony = folhaAnthony.gerar(anthony, cargoAnthony, horaAnthony);

        relatorio.imprimir(holAnthony);


        Cargo cargoJhonny = cadCargo.consultaNome("Auxiliar");
        Funcionario jhonny = cadFuncionario.consultaNome("Jhonny");

        LancarHoras horasJhonny = new LancarHoras();
        horasJhonny.lancar(20.0, 0.0);
        Hora horaJhonny = new Hora(horasJhonny.getHorasExtras(), horasJhonny.getHorasFaltantes());

        FolhaPagamento folhaJhonny = new FolhaPagamento(new ImpostoINSS2026(), new ImpostoIRPF2026());
        Holerite holJhonny = folhaJhonny.gerar(jhonny, cargoJhonny, horaJhonny);

        relatorio.imprimir(holJhonny);
    }
}