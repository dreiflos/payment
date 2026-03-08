public class LancarHoras {

    private final Hora hora;

    public LancarHoras() {
        this.hora = new Hora(0, 0);
    }

    public void lancar(double horasExtras, double horasFaltantes) {
        if (horasExtras < 0 || horasFaltantes < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas.");
        }
        hora.registroHoras(horasExtras, horasFaltantes);
    }

    public double getTotalHorasTrabalhadas(Cargo cargo) {
        return cargo.getHorasFixas() + hora.getHorasExtras() - hora.getHorasFaltantes();
    }

    public double getHorasExtras() {
        return hora.getHorasExtras();
    }

    public double getHorasFaltantes() {
        return hora.getHorasFaltantes();
    }

    public void exibirResumo(String nomeFuncionario, Cargo cargo) {
        System.out.println("============================================");
        System.out.println("     BANCO DE HORAS - " + nomeFuncionario);
        System.out.println("============================================");
        System.out.printf("Carga horária fixa  : %.1f h%n", cargo.getHorasFixas());
        System.out.printf("Horas extras        : %.1f h%n", hora.getHorasExtras());
        System.out.printf("Horas faltantes     : %.1f h%n", hora.getHorasFaltantes());
        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL TRABALHADO    : %.1f h%n", getTotalHorasTrabalhadas(cargo));
        System.out.println("============================================");
    }
}