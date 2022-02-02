package Ejercicio_02;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    private double radio;
    

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getCircunferencia() {
        return radio;
    }

    public void setCircunferencia() {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio = scan.nextDouble();
    }
    
    public double calcularArea(){
        return  Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI + radio;
    }
}
