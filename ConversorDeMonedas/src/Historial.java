import java.util.ArrayList;
import java.util.List;

public class Historial {
    List<Moneda> historial;
    public Historial(){
        historial = new ArrayList<>();
    }
    public void insertarConversion(Moneda moneda){
        historial.add(moneda);
    }
    public void mostrarHistrial(){
        int i = 1;
        for(Moneda item:historial){
            System.out.println("Nro "+i+++": de "+item.getCodigoBase()+" a "+item.getCodigoObjetivo()+" tasa de conversion: "+item.getTasaDeConversion()+" valor: "+item.getValor()+" resultado: "+item.getResultadoConversion());
        }
    }
}
