package Ejercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    public void crearRectangulo() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base del rectangulo: ");
        base = scan.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = scan.nextDouble();
    }

    public void dibujarRectangulo(double base, double altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (i == 1 || j == 1 || i == altura || j == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
