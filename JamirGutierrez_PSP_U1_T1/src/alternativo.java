import javax.swing.*;
import java.awt.event.*;

public class alternativo{
    public static void main(String[] args) {
        ventana();
    }

//El metodo ventana crea una interfaz gráfica simple con un campo de texto.

    public static void ventana() {
        JFrame frame = new JFrame();
        JTextField textField = new JTextField(); // crea un campo de texto

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == '*') {
                    System.out.println("Has escrito: " + textField.getText());
                    System.exit(0);
                }
            }
        });

        frame.add(textField); // agrega campo texto
        frame.setSize(300, 200); // tamaño ventana
        frame.setVisible(true); // visible
        frame.setLocationRelativeTo(null); // centrar en pantalla

    }
}