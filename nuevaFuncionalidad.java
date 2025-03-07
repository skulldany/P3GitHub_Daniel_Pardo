package ejercicio1;

import java.util.Scanner;

public class nuevaFuncionalidad {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Introduce la longitud del array: ");
		    int longitud = scanner.nextInt();
		    System.out.print("Introduce el valor por defecto: ");
		    int valorPorDefecto = scanner.nextInt();
		    int[] numeros = new int[longitud];
		    
		    for (int i = 0; i < longitud; i++) {
		     System.out.println (numeros[i] = valorPorDefecto);


	}

}
}