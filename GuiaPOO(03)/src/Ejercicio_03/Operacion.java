package Ejercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double numero1;
    private double numero2;
    
    private static Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public Operacion() {

    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el primer valor: ");
        this.numero1 = scan.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        this.numero2 = scan.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        if (numero1 != 0 || numero2 != 0) {
            return numero1 * numero2;
        } else {
            System.out.println("Error, multiplicacion por cero.");
            return 0;
        }
    }

    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error, no se puede dividir por cero.");
            return 0;
        }
    }
}
