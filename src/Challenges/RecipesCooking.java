import java.util.Scanner;

public class RecipesCooking {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        System.out.print("Ingrese los ingredientes de la receta: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingrese el tiempo de preparacion de la receta: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la dificultad de la receta: ");
        var dificultad = consola.nextLine();


        System.out.println("\n--- Receta de cocina ---");
        System.out.println("\tNombre de la receta = " + nombreReceta);
        System.out.println("\tIngredientes de la receta = " + ingredientes + "Minutos");
        System.out.println("\tTiempo de preparacion = " + tiempoPreparacion);
        System.out.println("\tDificultad de la receta = " + dificultad);

    }
}
