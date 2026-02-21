public class Hora {
    private double horasExtras;
    private double horasFaltantes;


    public Hora( double horasExtras, double horasFaltantes) {
        this.horasExtras = horasExtras;
        this.horasFaltantes = horasFaltantes;
    }

    public void registroHoras(double novasHorasExtras, double novasHorasFaltantes) {
        this.horasExtras += novasHorasExtras;
        this.horasFaltantes += novasHorasFaltantes;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }


    public double getHorasFaltantes() {
        return horasFaltantes;
    }


    public void setHorasFaltantes(double horasFaltantes) {
        this.horasFaltantes = horasFaltantes;
    }


}