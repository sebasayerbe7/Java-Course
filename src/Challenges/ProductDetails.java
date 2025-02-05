public class ProductDetails {
    public static void main(String[] args) {
        // Defino las variables
        String nombreProducto = "Manga";
        int precio = 20000;
        int cantidad = 10;
        boolean disponible = true;

        // Imprimo las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
        System.out.println("disponible = " + disponible);

        // Modifico los valores de las variables
        nombreProducto = "Sudoku";
        precio = 40000;
        cantidad = 5;
        disponible = false;

        // Imprimo nuevamente las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
        System.out.println("disponible = " + disponible);
    }
}
