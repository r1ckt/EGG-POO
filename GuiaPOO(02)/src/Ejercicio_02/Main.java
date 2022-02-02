/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 */
package Ejercicio_02;


public class Main {

    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia();
        
        circ1.crearCircunferencia();
        
        System.out.printf("El area de la circunferencia es: %.2f\n", circ1.calcularArea());
        System.out.printf("El perimetro de la circunferencia: %.2f\n", circ1.calcularPerimetro());
    }
    
}
