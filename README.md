import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operacion;

        System.out.println("Bienvenido a la calculadora");
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = scanner.next();

        double resultado = 0;
        boolean valido = true;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                valido = false;
                break;
        }

        if (valido) {
            System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " es: " + resultado);
        }

        scanner.close();
    }
}
