/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package ejercicio_11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fechaActual = new Date();

        System.out.println("Ingrese el dia: ");
        int dia = scan.nextByte();

        System.out.println("Ingrese el mes: ");
        int mes = scan.nextByte();

        System.out.println("Ingrese el año:");
        int anio = scan.nextInt();

        // creo la fecha ingresada por el usuario
        Date fecha = new Date(anio, mes, dia);

        System.out.printf("La feha ingrseada es: %d/%d/%d \n", fecha.getDate(), fecha.getMonth(), fecha.getYear());
        System.out.printf("La fecha de hoy es: %d/%d/%d \n", fechaActual.getDate(), fechaActual.getMonth() + 1, fechaActual.getYear() + 1900);

        // uso Math.abs() en caso de que el usuario ingrese una fecha mayor a la actual
        int diferencia = Math.abs(fechaActual.getYear() + 1900 - fecha.getYear());

        if (diferencia == 1) {
            System.out.printf("La diferencia de años entre las dos fechas es: %d año \n", diferencia);
        } else {
            System.out.printf("La diferencia de años entre las dos fechas es: %d años \n", diferencia);
        }
        
    }

}
