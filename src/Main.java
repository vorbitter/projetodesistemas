public class Main{
    public static void main(String[] args){
        Desenhista desenhista = new Desenhista();
        Circulo circulo = new Circulo();
        circulo.raio = 10.0;
        System.out.println(desenhista.getPerimetro(circulo));

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 12.0;
        System.out.println(desenhista.getPerimetro(quadrado));
    }
}