package view.gui;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de JFrame (ventana)
        JFrame frame = new JFrame("Login Example");
        
        // Configurar la operación de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear una instancia de NewJPanel (tu JPanel personalizado)
        NewJPanel panel = new NewJPanel();
        
        // Agregar el JPanel al JFrame
        frame.add(panel);
        
        // Ajustar el tamaño de la ventana según el contenido
        frame.pack();
        
        // Establecer el tamaño de la ventana manualmente (opcional)
        frame.setSize(600, 400);
        
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}