package ejercicio_extra_06;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ahorcado {

    private String[] palabraABuscar;
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public String[] getpalabraABuscar() {
        return palabraABuscar;
    }

    public void setpalabraABuscar(String[] buscarPalabra) {
        this.palabraABuscar = buscarPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public void crearJuego() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese la palabra: ");
        String palabra = scan.next();

        //letras
        palabraABuscar = palabra.split("");
        int longitud = palabra.length();

        System.out.println("Intentos Máximos: ");
        jugadasMaximas = scan.nextInt();

        letrasEncontradas = 0;
    }

    public void longitud() {
        System.out.println("La palabra tiene " + this.palabraABuscar.length + " letras.");
    }

    public void buscarLetra(String letra) {
        boolean flag = false;
        for (String caracter : palabraABuscar) {
            if (caracter.equals(letra)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("La letra pertenece a la frase.");
        }
    }

    public boolean encontradas(String letra) {

        boolean flag = false;

        for (int i = 0; i < palabraABuscar.length; i++) {
            if (palabraABuscar[i].equals(letra)) {
                letrasEncontradas++;
                flag = true;
            }
        }

        if (flag) {
            System.out.println("La letra se encuentra repetida " + letrasEncontradas + " veces en la palabra.");
            System.out.println("Faltan " + (palabraABuscar.length - letrasEncontradas) + " letras.");
            return true;
        } else {
            System.out.println("Vuelva a intentarlo.");
            return false;
        }

    }

    public void intentos() {
        jugadasMaximas--;
        System.out.println("Le quedan " + jugadasMaximas + " intentos");

    }

    public void mostrarPalabra() {
        for (String string : palabraABuscar) {
            System.out.print("Solucion: " + string);
        }
        System.out.println("");
    }

    public void juego() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        crearJuego();

        while (jugadasMaximas > 0 && letrasEncontradas < this.palabraABuscar.length) {
            System.out.println("Ingrese una letra: ");
            String letra = scan.next();

            longitud();
            buscarLetra(letra);
            encontradas(letra);
            intentos();
        }

        mostrarPalabra();

    }
}
