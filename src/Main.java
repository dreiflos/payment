import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro nome do funcionário: ");
        String nomeDigitado = leitor.nextLine();
        System.out.print("Digite o sobrenome do funcionário: ");
        String sobrenomeDigitado = leitor.nextLine();

        System.out.println("\nGerando holerite de " + nomeDigitado + "\n");

        Funcionario func1 = new Funcionario(nomeDigitado, sobrenomeDigitado, "3333-33", "rua jasmin", new Date(), null, new Date());

        Cargo cargoFunc1 = new Cargo(3000.00, "Dev", "desenvolvimento", 230.00);
        Hora hora1 = new Hora(15.0, 5.0);
        Pagamento pagamentoMes = new Pagamento(func1, cargoFunc1, hora1);
        pagamentoMes.gerarHolerite();

        leitor.close();
    }
}