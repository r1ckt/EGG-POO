package ejercicio_09;

public class Matematica {

    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double devolverMayor() {

        System.out.printf("Mayor: %.2f \n", Math.max(num1, num2));
        return Math.max(num1, num2);
    }

    public long calcularPotencia() {
        int number1 = (int) Math.round(num1);
        int number2 = (int) Math.round(num2);

        long potencia1 = (long) Math.pow(number1, number2);
        long potencia2 = (long) Math.pow(number2, number1);

        if (number1 > number2) {
            System.out.printf("%d ^ %d = %d \n", number1, number2, potencia1);
            return potencia1;
        } else {
            System.out.printf("%d ^ %d = %d \n", number2, number1, potencia2);
            return potencia2;
        }
    }
    
    public double calcularRaiz(){
        double menorAbs = Math.abs(Math.min(num1, num2));
        System.out.printf("Raiz cuadrada de %.2f = %.2f \n", menorAbs, Math.sqrt(menorAbs));
        return Math.sqrt(menorAbs);
    }
}
