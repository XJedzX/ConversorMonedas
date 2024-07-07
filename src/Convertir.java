import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Convertir {

    static List<String> historial = new ArrayList<>();
    public static void convertidor(String sitea, String siteb, Buscarmoneda cambio, Scanner entrada){
        double valor;
        double valorf;
        System.out.println("Ingrese el valor que desea convertir:");
        Exchange exchange=cambio.moneda(sitea,siteb);
        valor =entrada.nextDouble();
        valorf = valor*exchange.conversion_rate();
        String conreciente = String.valueOf(valor)+" "+sitea+"==>"+String.valueOf(valorf)+" "+siteb;
        historial.add(conreciente);
        System.out.println("El valor "+valor+" "+sitea+" equivale a "+valorf+" "+siteb+".");
        System.out.println("Conversiones recientes "+historial);
    }
}
