public class TrianguloRectangulo {
    int base;
    int altura;
    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    double areaTrianguloRectangulo(){
        return ((base*altura)/2);
    }
    double perimetroTrianguloRectangulo(){
        return base + altura + calculoHipotenusa();
    }

    double calculoHipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calculoHipotenusa()) && (altura == calculoHipotenusa()))
            System.out.println("Es un triángulo equilátero");
        else if ((base != altura) && (base != calculoHipotenusa()) && (altura != calculoHipotenusa()))
            System.out.println("Es un triángulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
    }
}
