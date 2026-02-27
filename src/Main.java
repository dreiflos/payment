import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro nome do funcionário: ");
        String nomeDigitado = leitor.nextLine();
        System.out.print("Digite o sobrenome do funcionário: ");
        String sobrenomeDigitado = leitor.nextLine();

        Funcionario func1 = new Funcionario(
                nomeDigitado,
                sobrenomeDigitado,
                "3333-33",
                "rua jasmin",
                LocalDate.now(),
                null,
                LocalDate.of(1990, 5, 20)
        );

        Cargo cargoFunc1 = new Cargo(3000.00, "Dev", "desenvolvimento", 230.00);
        Hora hora1 = new Hora(15.0, 5.0);


        CalculadorImposto calculadorInss = new Imposto();

        FolhaPagamento folhaPagamento = new FolhaPagamento(calculadorInss);

        Holerite resultado = folhaPagamento.gerar(func1, cargoFunc1, hora1);


        SaidaRelatorio relatorio = new SaidaRelatorio();
        relatorio.imprimir(resultado);

        leitor.close();
    }
}