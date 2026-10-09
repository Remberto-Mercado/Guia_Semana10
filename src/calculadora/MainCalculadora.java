package calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.sumar(2, 3));        // sumar(int, int)
        System.out.println(c.sumar(2.5, 3.5));    // sumar(double, double)
        System.out.println(c.sumar(1, 2, 3));     // sumar(int, int, int)
    }
}
