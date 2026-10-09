package figuras;

public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {           // SOBRESCRITURA
        return base * altura;
    }

    public double calcularArea(double factor) {   // SOBRECARGA
        return base * altura * factor;
    }
}
