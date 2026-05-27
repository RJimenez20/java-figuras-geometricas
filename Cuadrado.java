public class Cuadrado {
    int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }

    double areaCuadrado(){
        return lado*lado;
    }
    double perimetroCuadrado(){
        return 4*lado;
    }
}
