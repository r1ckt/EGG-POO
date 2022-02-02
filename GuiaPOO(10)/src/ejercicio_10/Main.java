/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
 */
package ejercicio_10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];

        // lleno el vector A con numeros aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 10;
        }

        // imprimo el vector A
        System.out.println(Arrays.toString(A));

        // ordeno de manera ascendente el vector A
        System.out.println("Vector A ordenado de manera ascendente: ");
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));


        B = Arrays.copyOfRange(A, 0, 20);
        System.out.println("Vector B : ");
        System.out.println(Arrays.toString(B));
        
        // lleno los ultimos indices del vector B con 0.5
        Arrays.fill(B, 10, B.length, 0.5);
        System.out.println("Vector B final: ");
        System.out.println(Arrays.toString(B));
        
    }

}
