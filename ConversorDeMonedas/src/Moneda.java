public class Moneda {
    private String horaUltimaActualizaciónUtc;//time_last_update_utc;
    private String horaProximaActualizaciónUtc;//time_next_update_utc;
    private String codigoBase;//base_code;
    private String codigoObjetivo;//target_code;
    private double tasaDeConversion;//conversion_rate;
    private double resultadoConversion;//conversion_result;
    private double valor;

    public Moneda(MonedaOmdb monedaOmdb,double valor){
        this.horaUltimaActualizaciónUtc = monedaOmdb.time_last_update_utc();
        this.horaProximaActualizaciónUtc = monedaOmdb.time_next_update_utc();
        this.codigoBase = monedaOmdb.base_code();
        this.codigoObjetivo = monedaOmdb.target_code();
        this.tasaDeConversion = monedaOmdb.conversion_rate();
        this.resultadoConversion = monedaOmdb.conversion_result();
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getHoraUltimaActualizaciónUtc() {
        return horaUltimaActualizaciónUtc;
    }

    public String getHoraProximaActualizaciónUtc() {
        return horaProximaActualizaciónUtc;
    }

    public String getCodigoBase() {
        return codigoBase;
    }

    public String getCodigoObjetivo() {
        return codigoObjetivo;
    }

    public double getTasaDeConversion() {
        return tasaDeConversion;
    }

    public double getResultadoConversion() {
        return resultadoConversion;
    }
}
