
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Funcionario func1 = new Funcionario("Andrei", "Flores", "3333-33", "rua jasmin", new Date(), null, new Date());

        Cargo cargoFunc1 = new Cargo(3000.00, "Dev", "desenvolvimento", 230.00);

        double horasTrabalhadas = 230.0;

        Hora hora1 = new Hora(35.0, 35.0);

        Pagamento pagamentoMes = new Pagamento(func1, cargoFunc1, horasTrabalhadas);

        pagamentoMes.gerarHolerite();

    }

}