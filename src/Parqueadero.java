import java.util.Scanner;

public class Parqueadero {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String tipoVehiculo;
        int horaLlegada;
        double costo = 0;

        System.out.print("Por favor ingresa el tipo de vehiculo (auto, moto, bicicleta): ");
        tipoVehiculo = entrada.next().toLowerCase();

        System.out.print("Por favor ingresa la hora de llegada (0-23): ");
        horaLlegada = entrada.nextInt();

        switch (tipoVehiculo) {
            case "auto":
                costo = 5000;
                break;
            case "moto":
                costo = 3000;
                break;
            case "bicicleta":
                costo = 1000;
                break;
            default:
                System.out.println("El tipo de vehiculo no es valido");
                entrada.close();
                return;
        }

        if (horaLlegada >= 20) {
            costo = costo + (costo * 0.20);
        }

        System.out.println("El costo total del parqueo es de: $" + costo);

        entrada.close();
    }
}
