import java.util.Scanner;

public class PrincipalConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertirMoneda convertirMoneda = new ConvertirMoneda();
        Historial historial = new Historial();
        int opcion=0;
        double valor;
        Moneda moneda;
        while(opcion!=8){
            menu();
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor en Dolares que " +
                            "deseas convertir a Peso argentino:");
                    valor = scanner.nextDouble();
                    moneda = convertir(convertirMoneda,"USD","ARS",valor);
                    System.out.println(moneda);
                    historial.insertarConversion(moneda);
                    break;
                case 2:
                    System.out.println("Ingrese el valor en Peso argentino que " +
                            "deseas convertir a Dólar:");
                    valor = scanner.nextDouble();
                    moneda = convertir(convertirMoneda,"ARS","USD",valor);
                    historial.insertarConversion(moneda);
                    break;
                case 3:
                    System.out.println("Ingrese el valor en Dólar que " +
                            "deseas convertir a Real brasileño:");
                    valor = scanner.nextDouble();
                    moneda = convertir(convertirMoneda,"USD","BRL",valor);
                    historial.insertarConversion(moneda);
                    break;
                case 4:
                    System.out.println("Ingrese el valor en Real Brasileño que " +
                            "deseas convertir a Dólar:");
                    valor = scanner.nextDouble();
                    moneda = convertir(convertirMoneda,"BRL","USD",valor);
                    historial.insertarConversion(moneda);
                    break;
                case 5:
                    System.out.println("Ingrese el valor en Dólar que " +
                            "deseas convertir a Peso boliviano:");
                    valor = scanner.nextDouble();
                    moneda = convertir(convertirMoneda,"USD","BOB",valor);
                    historial.insertarConversion(moneda);
                    break;
                case 6:
                    System.out.println("Ingrese el valor en Peso boliviano que " +
                            "deseas convertir a Dólar:");
                    valor = scanner.nextDouble();
                    moneda = convertir(convertirMoneda,"BOB","USD",valor);
                    historial.insertarConversion(moneda);
                    break;
                case 7:
                    historial.mostrarHistrial();
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso Boliviano");
        System.out.println("6) Peso Boliviano =>> Dólar");
        System.out.println("7) Mostrar historial");
        System.out.println("8) Salir");
        System.out.println("Elija una opción válida");
        System.out.println("*************************************************");
    }
    public static Moneda convertir(ConvertirMoneda convertirMoneda,String origen, String destino, double valor){
        MonedaOmdb monedaOmdb = convertirMoneda.convetir(
                valor,
                origen,
                destino);
        Moneda moneda = new Moneda(monedaOmdb, valor);
        System.out.println("El valor "+
                moneda.getValor()+
                " [USD] corresponde a =>> "+
                moneda.getResultadoConversion()+
                " [ARS]");
        return moneda;
    }
}
