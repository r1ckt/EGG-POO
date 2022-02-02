/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
package ejercicio_08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena1 = new Cadena();

        System.out.println("Ingresar frase: ");
        String frase = scan.next();
        
        cadena1.setCadena(frase);
        cadena1.setLongitud(frase.length());
        
        cadena1.mostrarVocales();
    
        cadena1.invertirFrase();
        
        System.out.println("");
        System.out.println("Ingrese una letra para verificar si esta repetida: ");
        cadena1.vecesRepetido(scan.next());
        
        System.out.println("");
        cadena1.unirFrases();
       
        System.out.println("");
        
        System.out.println("Con que letra desea reemplazar la letra 'a' ?: "); 
        cadena1.reemplazar(scan.next());
        
        System.out.println("Ingrese una letra para verificar si se encuentra en la frase: ");
        
        cadena1.contiene(scan.next());
        
    }

}
