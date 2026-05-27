public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    double areaRectangulo(){
        return base * altura;
    }
    double perimetroRectangulo(){
        return (base*2) + (altura*2)
    }
}
