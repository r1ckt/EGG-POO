package ejercicio_extra_03;

public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminante(){
        return Math.pow(b, 2) - (4 * a * c);
    }
    
    public boolean tieneRaices(){
        return getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
    
    public void obtenerRaices(){
        if(tieneRaices()){
            System.out.println("Soluciones: ");
            System.out.printf("Raiz 1: %.2f \n",((-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c))) / 2 * this.a);
            System.out.printf("Raiz 2: %.2f \n",((-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c))) / 2 * this.a);
        } 
    }
    public void obtenerRaiz(){
        if(tieneRaiz()){
            System.out.println("Solucion: ");
            System.out.printf("Raiz 2: %.2f \n", (-this.b + Math.pow(this.b, 2) - 4 * this.a * this.c) / 2 * this.a);
        }
    }
    public void calcular(){
        if(tieneRaiz()){
            System.out.println("La ecuacion tiene una unica solucion.");
            obtenerRaiz();
        }
        if(tieneRaices()){
            System.out.println("La ecuacion tiene dos soluciones.");
            obtenerRaices();
        }
    }
}
