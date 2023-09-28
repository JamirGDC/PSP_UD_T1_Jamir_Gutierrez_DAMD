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


