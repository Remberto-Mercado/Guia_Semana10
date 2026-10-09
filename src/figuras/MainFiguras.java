package figuras;

public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(1),
            new Rectangulo(3, 4),
            new Triangulo(3, 4)
        };
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
        }

        Rectangulo r = new Rectangulo(3, 4);
        System.out.println(r.calcularArea(2));
    }
}
