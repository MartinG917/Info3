public class Potencia {

    // Función recursiva para calcular a^b
    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;  // Cualquier número elevado a 0 es 1
        } else {
            return a * potencia(a, b - 1);  // Multiplica recursivamente
        }
    }
}
 
