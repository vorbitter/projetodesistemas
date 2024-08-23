public class Triangulo implements IFigura{
    public double ladoA = 0.0;
    public double ladoB = 0.0;
    public double ladoC = 0.0;

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
