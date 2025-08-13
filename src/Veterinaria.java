import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String tipoAnimal;
        int edadAnimal;
        String veterinarioAsig = "";
        boolean vacunacionExtra = false;

        System.out.print("Por favor ingresa el tipo de animal (perro, gato, ave, otro): ");
        tipoAnimal = entrada.next().toLowerCase();

        System.out.print("Por favor ingresa la edad del animal: ");
        edadAnimal = entrada.nextInt();

        switch (tipoAnimal) {
            case "perro":
                veterinarioAsig = "Dr. Parra, especialista en caninos";
                if (edadAnimal > 5) {
                    vacunacionExtra = true;
                }
                break;
            case "gato":
                veterinarioAsig = "Dr. Rayo, especialista en felinos";
                if (edadAnimal > 5) {
                    vacunacionExtra = true;
                }
                break;
            case "ave":
                veterinarioAsig = "Dr. Dueñas, especialista en aves";
                break;
            default:
                veterinarioAsig = "Dr. Galvan, doctor general";
        }

        System.out.println("El veterinario asignado es: " + veterinarioAsig);

        if (vacunacionExtra) {
            System.out.println("Recomendacion: vacunacion adicional necesaria");
        }

        entrada.close();
    }
}
