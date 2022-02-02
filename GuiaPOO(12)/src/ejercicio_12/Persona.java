
package ejercicio_12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {
    String nombre;
    Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void crearPersona(){
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre = scan.next();
        System.out.println("Ingrese el dia de su nacimiento: ");
        byte dia = scan.nextByte();
        System.out.println("Ingrese el mes de su nacimiento: ");
        byte mes = scan.nextByte();
        System.out.println("Ingrese el año de su nacimiento: ");
        int anio = scan.nextInt();
        
        Date fecha = new Date();
        fecha.setDate(dia);
        fecha.setMonth(mes);
        fecha.setYear(anio);
        this.fechaDeNacimiento = fecha;
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear();
        int anioDeNacimiento = fechaDeNacimiento.getYear();

        return anioActual + 1900 - anioDeNacimiento; 
    }
    
    public boolean menorQue(int edad){
        if(calcularEdad() < edad){
            System.out.printf("Es %d años menor \n", Math.abs(calcularEdad() - edad));
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarPersona(){
        System.out.printf("Nombre: %s \n", this.nombre);
        System.out.printf("Edad: %d años \n", calcularEdad());
    }
}
