public class Circulo implements IFigura {
    public double raio = 0.0;

    @Override
    public double calcularPerimetro() {
        return 2 * raio * Math.PI;
    }
}
