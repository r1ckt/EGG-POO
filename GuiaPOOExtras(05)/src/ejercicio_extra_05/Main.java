/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. 
 */
package ejercicio_extra_05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiempre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[2];

        System.out.println("Adivine el mes secreto: ");
        String respuesta = scan.next().toLowerCase();

        while (!respuesta.equals(mesSecreto)) {
            System.out.println("No ha acertado, intentelo nuevamente!");
            respuesta = scan.next();
        }
        System.out.println("Ha acertado, el mes secreto es " + mesSecreto + ", muchas gracias por jugar.");
    }

}
