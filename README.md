# Metodo asterisco

* La clase asterisco proporciona un método para leer caracteres hasta que se ingresa un asterisco (*).
* Lee caracteres de la entrada estándar hasta que se ingresa un asterisco (*).
* La cadena de caracteres leída. Retorna null si hay un error.
     
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class asterisco {

    // Método que lee caracteres hasta que se ingresa un asterisco (*) y devuelve la cadena leída
    public static String leerHastaAsterisco() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();

        try { //captura de excepciones
            // Bucle que se ejecuta hasta encontrar un asterisco
            while (true) {
                char c = (char) reader.read();
                if (c == '*') { // si el caracter es un asterisco, se devuelve la cadena leída
                    return input.toString();
                }
                input.append(c);
            }
        } catch (IOException e) { //captura de excepciones
            e.printStackTrace(); //imprime la excepción
        }

        return null; // si hay error devuelve null
    }
}
```

# Main Class

* La clase main es la entrada principal del programa
* param args no se utilizan en este caso.

```
public class Main {
    public static void main(String[] args) {
        String input = asterisco.leerHastaAsterisco(); //llamada al metodo de la clase asterisco

        if (input != null) {
            System.out.println("Has introducido: " + input); //imprime la cadena leida
        } else {
            System.out.println("Error al leer la entrada.");
        }
    }


}
```
# Solución alternativa

Durante la ejecucion del programa me he encontrado con un problema y es que creo que la forma en la que mi terminal o consola maneja el tipo de entrada es con ENTER, es por eso que decidi hacer este ejercicio con un jframe.

```
import javax.swing.*;
import java.awt.event.*;

public class Main {
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
```
