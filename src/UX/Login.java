package UX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import model.Customer;

public class Login extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    // Simulación de base de datos
    private final Customer[] customers = {
        new Customer(1, "Juan", "Pérez", "juan@example.com", "123456789", "Madrid", "2024-01-01", "ABC123", "1234"),
        new Customer(2, "Ana", "García", "ana@example.com", "987654321", "Barcelona", "2023-05-12", "DEF456", "password"),
        new Customer(3, "Carlos", "López", "carlos@example.com", "111222333", "Valencia", "2022-11-20", "GHI789", "admin")
    };

    public Login() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Contraseña:"));
        passwordField = new JPasswordField();
        add(passwordField);

        JButton loginButton = new JButton("Login");
        add(loginButton);

        messageLabel = new JLabel("", JLabel.CENTER);
        add(messageLabel);

        loginButton.addActionListener(this::handleLogin);

        setVisible(true);
    }

    private void handleLogin(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        Customer customer = authenticate(email, password);
        if (customer != null) {
            dispose(); // Cerrar la ventana de login
            new ProductScreen(null);
        } else {
            messageLabel.setText("Email o contraseña incorrectos.");
        }
    }

    private Customer authenticate(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer;
            }
        }
        return null;
    }
}
