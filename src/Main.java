import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu menu =new Menu();
        var entrada =new Scanner(System.in);
        Buscarmoneda cambio = new Buscarmoneda();

        while (true){
            System.out.println(menu.getMenuDeOpcion());
            int opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    Convertir.convertidor("USD","ARS",cambio,entrada);
                    break;
                case 2:
                    Convertir.convertidor("ARS","USD",cambio,entrada);
                    break;
                case 3:
                    Convertir.convertidor("USD","BRL",cambio,entrada);
                    break;
                case 4:
                    Convertir.convertidor("BRL","USD",cambio,entrada);
                    break;
                case 5:
                    Convertir.convertidor("USD","COP",cambio,entrada);
                    break;
                case 6:
                    Convertir.convertidor("COP","USD",cambio,entrada);
                    break;
                case 7:
                    System.out.println("Conversiones recientes "+Convertir.historial);
                    break;
                case 8:
                    System.out.println("Adios, Que tenga un buen Dia");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
                if (opcion==8){
                break;
            }
        }
    }
}