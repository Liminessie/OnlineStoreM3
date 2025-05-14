package UX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import model.Customer;
import java.net.HttpURLConnection;
import java.net.URL;

public class Login extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    /*  
    private final Customer[] customers = {
        new Customer(1, "Juan", "Pérez", "juan@example.com", "123456789", "Madrid", "2024-01-01", "ABC123", "1234"),
        new Customer(2, "Ana", "García", "ana@example.com", "987654321", "Barcelona", "2023-05-12", "DEF456", "password"),
        new Customer(3, "Carlos", "López", "carlos@example.com", "111222333", "Valencia", "2022-11-20", "GHI789", "admin")
    };
    */
    public Login() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Username:"));
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

    public static void main(String[] args) {
        new Login();
    }

    private void handleLogin(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        authenticateSP(email, password);
    }

    private Customer authenticateSP(String email, String password) {

        try {
            URL url = new URL("http://localhost:8095/api/login");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            String jsonInputString = "{\"username\": \"" + email + "\", \"password\": \"" + password + "\"}";
            try (java.io.OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                dispose(); // Cerrar la ventana de login
                new ProductScreen(null);
            } else {
                messageLabel.setText("Email o contraseña incorrectos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
