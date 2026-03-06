import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CadFuncionario {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public CadFuncionario() {
        cadastrarFuncionario();
    }

    private void cadastrarFuncionario() {
        funcionarios.add(new Funcionario("Andrei", "Flores", "3334-55",
                "Cambará", LocalDate.now(), null,
                LocalDate.of(2004, 8, 3)));
        funcionarios.add(new Funcionario("Gustavo", "Vieira", "4434-55",
                "Palmeiras", LocalDate.now(), null,
                LocalDate.of(2004, 9, 20)));
        funcionarios.add(new Funcionario("Anthony", "Araujo", "5544-55",
                "Nova York", LocalDate.now(), null,
                LocalDate.of(2005, 12, 22)));
        funcionarios.add(new Funcionario("Jhonny", "Pinto", "3456-88",
                "Palonia", LocalDate.now(), null,
                LocalDate.of(2003, 2, 20)));
    }

    public Funcionario consultaNome (String primeiroNome){
        for (Funcionario f : funcionarios){
            if (f.getPrimeiroNome().equalsIgnoreCase(primeiroNome)){
                return f;
            }
        }
        throw new RuntimeException("Funcionário não encontrado: " + primeiroNome);
    }

    public List<Funcionario> listarTodos() {
        return funcionarios;
    }
}
