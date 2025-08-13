import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double totalCompra;
        int cantidadProductos;
        String tieneMembresia;
        double totalFinal;

        System.out.print("Por favor ingresa el total de la compra: ");
        totalCompra = entrada.nextDouble();

        System.out.print("Por favor ingresa la cantidad de productos comprados: ");
        cantidadProductos = entrada.nextInt();

        System.out.print("¿Tienes membresia?: ");
        tieneMembresia = entrada.next();

        totalFinal = totalCompra;

        if(tieneMembresia.equalsIgnoreCase("si")){
            totalFinal = totalFinal - (totalFinal * 0.10);
        }

        if(cantidadProductos > 10){
            totalFinal = totalFinal - (totalFinal * 0.05);
        }
        System.out.println("El total a pagar es de: $" + totalFinal);

        entrada.close();
    }
}
