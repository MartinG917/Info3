public class Suma {
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + suma(n - 1);
        }
    }
}
