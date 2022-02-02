package Ejercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {

    }

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Metodos GET y SET
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return numPaginas;
    }

    public void setPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    // Metodos de comportamiento
    public void cargarLibro() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el código ISBN: ");
        this.isbn = scan.next();
        System.out.println("Ingrese el título: ");
        this.titulo = scan.next();
        System.out.println("Ingrese el nombre del autor: ");
        this.autor = scan.next();
        System.out.println("Ingrese la cantidad de paginas: ");
        this.numPaginas = scan.nextInt();
    }

    public void imprimirDatosLibro() {

        System.out.println("Paginas: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de páginas: " + numPaginas);

    }

}
