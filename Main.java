public class Main {
    public static void main(String[] args){
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);


        System.out.println("El area del circulo es: " + figura1.areaCirculo());
        System.out.println("El perimetro del circulo es: " + figura1.perimetroCirculo());

        System.out.println("El area del rectangulo es: " + figura2.areaRectangulo());
        System.out.println("El perimetro del rectangulo es: " + figura2.perimetroRectangulo());

        System.out.println("El area del cuadrado es: " + figura3.areaCuadrado());
        System.out.println("El perimetro del cuadradado es: " + figura3.perimetroCuadrado());

        System.out.println("El area del triangulo rectangulo es: " + figura4.areaTrianguloRectangulo());
        System.out.println("El perimetro del triangulo rectangulo es: " + figura4.perimetroTrianguloRectangulo());

        figura4.determinarTipoTriangulo();
    }
}
