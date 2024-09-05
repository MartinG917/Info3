public class InvertirCadena {
    
     // Función recursiva para invertir una cadena
    public static String invertir(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;  // Caso base: una cadena vacía no cambia
        } else {
            return invertir(cadena.substring(1)) + cadena.charAt(0);  // Llama recursivamente
        }
    }

    
}
