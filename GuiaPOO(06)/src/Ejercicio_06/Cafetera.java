package Ejercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantiudadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantiudadActual() {
        return cantidadActual;
    }

    public void setCantiudadActual(int cantiudadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.capacidadMaxima = 2000;
        this.cantidadActual = 2000; // centimetros cubicos
    }

    public void servirTaza(int tamañoTaza) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese la cantidad de cafe a servir en la taza: ");
        int servir = scan.nextInt();

        int cantidadCafeEnTaza = 0;

        if (cantidadCafeEnTaza <= tamañoTaza && servir <= tamañoTaza) {
            cantidadCafeEnTaza += servir;
            this.cantidadActual -= servir;

            if (servir == 200) {
                System.out.println("La taza está llena");
            }

            if (servir < tamañoTaza) {
                System.out.printf("No alcanza para llenar la taza, actualmente contiene %dcc de cafe\n", cantidadCafeEnTaza);
            }
        }

    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        this.cantidadActual = cantidad;
    }

}
