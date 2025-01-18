import controller.Cart;
import model.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        // Crear un catálogo simulado de productos
        ArrayList<Product> productCatalog = new ArrayList<>();
        productCatalog.add(new Product(1, "Camiseta", "Camiseta de algodón", 10.5f, 20.0f, 1, "Rojo", true, 100));
        productCatalog.add(new Product(2, "Pantalón", "Pantalón de mezclilla", 15.0f, 25.0f, 2, "Azul", true, 50));
        productCatalog.add(new Product(3, "Zapatos", "Zapatos deportivos", 20.0f, 40.0f, 3, "Negro", true, 30));

        // Crear el carrito del cliente
        Cart cart = new Cart();

        // Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menú de opciones
            System.out.println("\n*** Menú Carrito de Compras ***");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Buscar producto en el carrito");
            System.out.println("3. Eliminar producto del carrito");
            System.out.println("4. Listar productos en el carrito");
            System.out.println("5. Actualizar cantidad de producto en el carrito");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Agregar producto al carrito
                    System.out.print("Ingresa el ID del producto a agregar al carrito: ");
                    int addProductId = scanner.nextInt();
                    Product productToAdd = findProductById(productCatalog, addProductId);
                    if (productToAdd != null) {
                        cart.addElement(cart.getProductList(), productToAdd);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 2:
                    // Buscar producto en el carrito
                    System.out.print("Ingresa el ID del producto a buscar en el carrito: ");
                    int findProductId = scanner.nextInt();
                    cart.findElement(cart.getProductList(), findProductId);
                    break;

                case 3:
                    // Eliminar producto del carrito
                    System.out.print("Ingresa el ID del producto a eliminar del carrito: ");
                    int deleteProductId = scanner.nextInt();
                    cart.deleteElement(cart.getProductList(), deleteProductId);
                    break;

                case 4:
                    // Listar productos en el carrito
                    cart.listElement(cart.getProductList());
                    break;

                case 5:
                    // Actualizar cantidad de producto en el carrito
                    System.out.print("Ingresa el ID del producto a actualizar: ");
                    int updateProductId = scanner.nextInt();
                    Product updatedProduct = findProductById(productCatalog, updateProductId);
                    if (updatedProduct != null) {
                        System.out.print("Ingresa la nueva cantidad: ");
                        int newQuantity = scanner.nextInt();
                        updatedProduct.setUnit(newQuantity);
                        cart.updateElement(cart.getProductList(), updateProductId, updatedProduct);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 6:
                    // Salir
                    System.out.println("Gracias por usar el carrito de compras. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    // Método para buscar productos por ID en el catálogo
    private static Product findProductById(ArrayList<Product> productCatalog, int id) {
        for (Product p : productCatalog) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }
}
