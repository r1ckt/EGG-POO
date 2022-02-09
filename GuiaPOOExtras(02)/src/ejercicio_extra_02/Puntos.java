package ejercicio_extra_02;

import java.util.Locale;
import java.util.Scanner;

public class Puntos {

    private double x1, x2;
    private double y1, y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearPuntos() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el valor x1: ");
        x1 = scan.nextDouble();
        System.out.println("Ingrese el valor y1: ");
        y1 = scan.nextDouble();
        System.out.println("Ingrese el valor x2: ");
        x2 = scan.nextDouble();
        System.out.println("Ingrese el valor y2: ");
        y2 = scan.nextDouble();
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distancia;
    }
}
