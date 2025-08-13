import java.util.Scanner;

public class TiendaRopa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String tipoPrenda;
        int cantidad;
        double precioUnitario = 0;
        double total;

        System.out.print("Por favor ingrese el tipo de prenda (camisa, pantalon, chaqueta): ");
        tipoPrenda = entrada.next().toLowerCase();

        System.out.print("Por favor ingrese la cantidad de prendas: ");
        cantidad = entrada.nextInt();

        switch (tipoPrenda) {
            case "camisa":
                precioUnitario = 20000;
                break;
            case "pantalon":
                precioUnitario = 40000;
                break;
            case "chaqueta":
                precioUnitario = 60000;
                break;
            default:
                System.out.println("Este tipo de prenda no válido.");
                entrada.close();
                return;
        }

        total = precioUnitario * cantidad;

        if (cantidad > 5) {
            total = total - (total * 0.15);
        }

        System.out.println("El total a pagar es de: $" + total);

        entrada.close();
    }
}
