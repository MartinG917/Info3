import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Factorial");
            System.out.println("2. Suma de números naturales");
            System.out.println("3. Fibonacci");
            System.out.println("4. Invertir cadena");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int numFactorial = sc.nextInt();
                    System.out.println("Factorial de " + numFactorial + " es: " + Factorial.factorial(numFactorial));
                    break;
                case 2:
                    System.out.print("Introduce un número: ");
                    int numSuma = sc.nextInt();
                    System.out.println("Suma de los primeros " + numSuma + " números es: " + Suma.suma(numSuma));
                    break;
                case 3:
                    System.out.print("Introduce un número: ");
                    int numFibonacci = sc.nextInt();
                    System.out.println("El " + numFibonacci + "-ésimo número de Fibonacci es: " + Fibonacci.fibonacci(numFibonacci));
                    break;
                case 4:
                    System.out.print("Introduce una cadena: ");
                    String cadena = sc.next();
                    System.out.println("Cadena invertida: " + InvertirCadena.invertir(cadena));
                    break;
                case 5:
                    System.out.print("Introduce la base: ");
                    int base = sc.nextInt();
                    System.out.print("Introduce el exponente: ");
                    int exponente = sc.nextInt();
                    System.out.println(base + "^" + exponente + " es: " + Potencia.potencia(base, exponente));
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 6);

        sc.close();
    }
}
