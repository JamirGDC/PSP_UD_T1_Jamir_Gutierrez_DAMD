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
