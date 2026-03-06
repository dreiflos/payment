import java.util.ArrayList;
import java.util.List;

public class CadCargo {
    private final List<Cargo> cargos =  new ArrayList<>();

    public CadCargo(){
        cadastrarCargo();
    }

    public void cadastrarCargo(){
        cargos.add(new Cargo(3500.00, "Desenvolvedor Java JR",
                "Desenvolvimento",255.00 ));
        cargos.add(new Cargo(2800.00, "Suporte Técnico",
                "Suporte",255.00 ));
        cargos.add(new Cargo(2100.00, "Administrativo",
                "Financeiro",320.00 ));
        cargos.add(new Cargo(1800.00, "Auxiliar",
                "Suporte Técnico",180.00 ));
    }

    public Cargo consultaNome(String nome){
        for (Cargo c : cargos){
            if(c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        throw new RuntimeException("Nenhum cargo com esse nome: " + nome);
    }

    public List<Cargo> listarTodos(){
        return cargos;
    }
}
