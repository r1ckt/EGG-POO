package ejercicio_extra_04;

import java.util.Locale;
import java.util.Scanner;

public class NIF {

    private String letra;
    private int dni;

    public NIF() {
    }

    public NIF(String letra, int dni) {
        this.letra = letra;
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void crearNif() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su DNI: ");
        dni = scan.nextInt();
        letra = calcularLetra(dni);
    }

    public String calcularLetra(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letraResultado = "";
        String[] partes = letras.split("");
        int resultado = dni % 23;

        for (int i = 0; i < partes.length; i++) {
            if(i == resultado){
                letraResultado = partes[i];
            }
        }

        return letraResultado;
    }
    
    public void mostrar(){
        System.out.println(dni + "-" + letra);
    }

}
