import controller.Cart;
import java.util.ArrayList;
import java.util.Scanner;
import model.Customer;
import model.Employee;
import model.Product;
import controller.CustomerController;
import controller.EmployeeController;
import controller.Invoicing;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Invoicing invoicing = new Invoicing();

        // Listas de datos
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Product> productCatalog = new ArrayList<>();

        // Carga de productos
        productCatalog.add(new Product(1, "Vibrador Clásico", "Vibrador de silicona", 15.0f, 29.99f, 1, "Rosa", true, 50));
        productCatalog.add(new Product(2, "Lubricante", "Lubricante a base de agua", 3.5f, 9.99f, 2, "Transparente", true, 200));
        
        customers.add(new Customer(1, "Juan", "Pérez", "juan@example.com", "123456789", "Calle 123", "2024-01-01", "CIF123"));
        customers.add(new Customer(2, "María", "López", "maria@example.com", "987654321", "Avenida 456", "2024-02-01", "CIF456"));

        // Controladores
        CustomerController customerController = new CustomerController();
        EmployeeController employeeController = new EmployeeController();

        int mainChoice = -1;

        while (mainChoice != 0) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Empleados");
            System.out.println("3. Gestión de Carritos");
            System.out.println("4. Generar Factura");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            mainChoice = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (mainChoice) {
                case 1: // Gestión de Clientes
                    manageCustomers(scanner, customerController, customers);
                    break;

                case 2: // Gestión de Empleados
                    manageEmployees(scanner, employeeController, employees);
                    break;

                case 3: // Gestión de Carritos
                    manageCarts(scanner, cart, productCatalog);
                    break;

                case 4: // Generar Factura
                    System.out.print("Ingresa el ID del cliente para facturar: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    Customer customer = findCustomerById(customers, customerId);
                    
                    if (customer != null) {
                        invoicing.generateInvoice(customer, cart.getProductList());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void manageCustomers(Scanner scanner, CustomerController controller, ArrayList<Customer> customers) {
        int customerChoice;
        do {
            System.out.println("\n--- Gestión de Clientes ---");
            System.out.println("1. Añadir Cliente");
            System.out.println("2. Buscar Cliente");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Listar Clientes");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");
            customerChoice = scanner.nextInt();
            scanner.nextLine();

            switch (customerChoice) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String surname = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String phone = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String residence = scanner.nextLine();
                    System.out.print("Fecha de registro: ");
                    String registrationDate = scanner.nextLine();
                    System.out.print("CIF: ");
                    String taxID = scanner.nextLine();

                    Customer newCustomer = new Customer(id, name, surname, email, phone, residence, registrationDate, taxID);
                    controller.addElement(customers, newCustomer);
                    System.out.println("Cliente añadido con éxito.");
                    break;
                    
                case 5:
                    controller.listElement(customers);
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (customerChoice != 0);
    }

    private static void manageEmployees(Scanner scanner, EmployeeController controller, ArrayList<Employee> employees) {
        int employeeChoice;
        do {
            System.out.println("\n--- Gestión de Empleados ---");
            System.out.println("1. Añadir Empleado");
            System.out.println("2. Buscar Empleado");
            System.out.println("3. Actualizar Empleado");
            System.out.println("4. Eliminar Empleado");
            System.out.println("5. Listar Empleados");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");
            employeeChoice = scanner.nextInt();
            scanner.nextLine();

            switch (employeeChoice) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String surname = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String phone = scanner.nextLine();
                    System.out.print("Salario: ");
                    float salary = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Fecha de contratación: ");
                    String hireDate = scanner.nextLine();

                    Employee newEmployee = new Employee(id, name, surname, email, phone, salary, hireDate);
                    controller.addElement(employees, newEmployee);
                    System.out.println("Empleado añadido con éxito.");
                    break;

                case 5:
                    controller.listElement(employees);
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (employeeChoice != 0);
    }

    private static void manageCarts(Scanner scanner, Cart cart, ArrayList<Product> productCatalog) {
        int cartChoice;
        do {
            System.out.println("\n--- Gestión de Carritos ---");
            System.out.println("1. Añadir Producto al Carrito");
            System.out.println("2. Listar Productos del Carrito");
            System.out.println("3. Eliminar Producto del Carrito");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");
            cartChoice = scanner.nextInt();
            scanner.nextLine();

            switch (cartChoice) {
                case 1:
                    System.out.print("Ingresa el ID del producto: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    Product product = findProductById(productCatalog, productId);
                    if (product != null) {
                        cart.addElement(cart.getProductList(), product);
                        System.out.println("Producto añadido al carrito.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 2:
                    cart.listElement(cart.getProductList());
                    break;

                case 3:
                    System.out.print("Ingresa el ID del producto a eliminar: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    cart.deleteElement(cart.getProductList(), removeId);
                    System.out.println("Producto eliminado del carrito.");
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (cartChoice != 0);
    }

    private static Product findProductById(ArrayList<Product> productCatalog, int id) {
        for (Product p : productCatalog) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }
    
    private static Customer findCustomerById(ArrayList<Customer> customers, int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;  // Retorna null si no encuentra el cliente
    }
}
