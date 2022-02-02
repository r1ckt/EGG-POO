package Ejercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    private int nroCuenta;
    private long dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dni, long saldo) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        double interes = 0;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void ingresarDatos() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese su numero de cuenta: ");
        nroCuenta = scan.nextInt();

        System.out.println("Ingrese su DNI: ");
        dni = scan.nextLong();
    }

    public void ingresar(double ingreso) {
        this.saldo += ingreso;
    }

    public void retirar(double retiro) {
        if (saldo > 0 && retiro <= saldo) {
            saldo -= retiro;
        } else {
            System.out.println("El saldo actuales es: $0,00");
        }
    }

    public void extraccionRapida() {
        double veintePorciento = 0.2 * saldo;
        if (saldo > 0 && veintePorciento < saldo) {
            saldo -= 0.2 * saldo;
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + saldo);
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + nroCuenta);
        System.out.println("DNI: " + dni);
    }
}
