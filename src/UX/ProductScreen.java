package UX;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import model.Product;
import java.net.URL;


public class ProductScreen extends JFrame {
    private ArrayList<Product> cart = new ArrayList<>();
    private JTable productTable;
    private DefaultTableModel tableModel;
    private Product[] products;

    public ProductScreen(Product[] products) {
        this.products = products;
        setTitle("Lista de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] columnNames = {"Nombre", "Precio Venta", "Unidades"};
        tableModel = new DefaultTableModel(columnNames, 0);
        productTable = new JTable(tableModel);

        loadProducts();

        JScrollPane scrollPane = new JScrollPane(productTable);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addToCartButton = new JButton("Añadir al carrito");
        JButton viewCartButton = new JButton("Ver Carrito");
        
        addToCartButton.addActionListener(e -> addToCart());
        viewCartButton.addActionListener(e -> showCart());

        buttonPanel.add(addToCartButton);
        buttonPanel.add(viewCartButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void loadProducts() {
        tableModel.setRowCount(0); 
        for (Product product : products) {
            Object[] rowData = {
                product.getName(),
                product.getSalePrice(),
                product.getUnit()
            };
            tableModel.addRow(rowData);
        }
    }

    private void addToCart() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            Product selectedProduct = products[selectedRow];
            if (selectedProduct.getUnit() > 0) {
                cart.add(selectedProduct);
                selectedProduct.setUnit(selectedProduct.getUnit() - 1);
                loadProducts(); 
                JOptionPane.showMessageDialog(this, selectedProduct.getName() + " añadido al carrito.");
            } else {
                JOptionPane.showMessageDialog(this, "Sin stock disponible para " + selectedProduct.getName() + ".");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un producto para añadir al carrito.");
        }
    }

    private void showCart() {
        if (cart.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío.");
        } else {
            StringBuilder cartContents = new StringBuilder("Productos en el carrito:\n\n");
            float total = 0;

            for (Product product : cart) {
                cartContents.append(product.getName()).append(" - $").append(product.getSalePrice()).append("\n");
                total += product.getSalePrice();
            }

            cartContents.append("\nTotal: $").append(total).append("\n\n");
            
            int option = JOptionPane.showConfirmDialog(this, cartContents.toString() + "¿Quieres completar la compra?", "Carrito", JOptionPane.YES_NO_OPTION);
            
            if (option == JOptionPane.YES_OPTION) {
                generateInvoice(total);
                cart.clear();
                JOptionPane.showMessageDialog(this, "¡Compra realizada con éxito!");
            }
        }
    }

    private void generateInvoice(float total) {
        StringBuilder invoice = new StringBuilder("Factura de compra:\n\n");
        for (Product product : cart) {
            invoice.append(product.getName()).append(" - $").append(product.getSalePrice()).append("\n");
        }
        invoice.append("\nTotal a pagar: $").append(total);
        JOptionPane.showMessageDialog(this, invoice.toString(), "Factura", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        
        ArrayList<Product> product = new ArrayList<>();

        try {
                URL url = new URL("http://localhost:8095/api/productos");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
                );
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parsear manualmente el JSON (asumiendo formato simple)
                String json = response.toString();
                product = new ArrayList<>();

                // Eliminar corchetes y dividir por objetos
                json = json.substring(1, json.length() - 1); // Quita los []
                String[] userEntries = json.split("\\},\\{"); // Divide por "},{"

                for (String entry : userEntries) {
                    entry = entry.replaceAll("[{}\"]", ""); // Limpia caracteres
                    String[] fields = entry.split(","); // Divide por campos

                    String id = fields[0].split(":")[1].trim();
                    String name = fields[1].split(":")[1].trim();
                    String unit = fields[2].split(":")[1].trim();
                    String color = fields[3].split(":")[1].trim();
                    String stock = fields[4].split(":")[1].trim();
                    
                    product.add(new Product(
                        Integer.parseInt(id),
                        name,
                        Integer.parseInt(unit),
                        color,
                        Boolean.parseBoolean(stock)
                    ));
                }

                // Mostrar resultados
                StringBuilder sb = new StringBuilder();
                for (Product user : product) {
                    sb.append("ID: ").append(user.getID()).append("\n");
                    sb.append("Nombre: ").append(user.getName()).append("\n");
                    sb.append("Descripción: ").append(user.getDescription()).append("\n");
                    sb.append("Precio Proveedor: ").append(user.getSupplierPrice()).append("\n");
                    sb.append("Precio de Venta: ").append(user.getSalePrice()).append("\n");
                    sb.append("Categoría: ").append(user.getCategory()).append("\n");
                    sb.append("Color: ").append(user.getColor()).append("\n");
                    sb.append("Stock Disponible: ").append(user.isStock()).append("\n");
                    sb.append("Unidades: ").append(user.getUnit()).append("\n");
                    sb.append("--------------------------------------------------\n");
                }
                
            } catch (Exception ex) {
            ex.printStackTrace();
                    
        }

        /*
        
        Product[] products = {
            new Product(1, "Vibrador Clásico", "Vibrador de silicona con múltiples velocidades", 15.0f, 29.99f, 1, "Rosa", true, 50),
            new Product(2, "Lubricante", "Lubricante a base de agua, 250ml", 3.5f, 9.99f, 2, "Transparente", true, 200),
            new Product(3, "Anillo Vibrador", "Anillo vibrador para parejas", 5.0f, 14.99f, 3, "Morado", true, 75),
            new Product(4, "Lencería Sexy", "Conjunto de encaje para ocasiones especiales", 10.0f, 34.99f, 4, "Negro", true, 40),
            new Product(5, "Plug Anal", "Plug anal pequeño de silicona", 8.0f, 19.99f, 5, "Rojo", true, 60),
            new Product(6, "Bolas Kegel", "Bolas para ejercicios de suelo pélvico", 6.0f, 24.99f, 6, "Lila", true, 30),
            new Product(7, "Masturbador Masculino", "Masturbador con textura realista", 12.0f, 39.99f, 7, "Beige", true, 20),
            new Product(8, "Aceite de Masaje", "Aceite de masaje aromático, 150ml", 4.5f, 12.99f, 8, "Ámbar", true, 120),
            new Product(9, "Esposas", "Esposas metálicas con forro de felpa", 7.0f, 16.99f, 9, "Rojo", true, 100),
            new Product(10, "Fusta", "Fusta pequeña de cuero para juegos BDSM", 5.5f, 14.99f, 10, "Negro", true, 25)
        };
        */
        new ProductScreen(product.toArray(new Product[0]));
    }
}
