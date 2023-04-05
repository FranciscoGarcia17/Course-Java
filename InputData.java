import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		// Funciona para double, float, int and string
		Scanner entrada = new Scanner(System.in);
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		char cadena2;
		
		System.out.print("Digite una palabra: ");
		cadena2 = entrada2.next().charAt(0);
		
		System.out.println(cadena2);
		
		
		int number1, number2;
		String cadena;
		System.out.print("Digite una cadena de texto: ");
		cadena = entrada1.nextLine();
		
		System.out.println(cadena);
		System.out.print("Digite el numero 1: ");
		number1 = numero1.nextInt();
		
		System.out.print("Digite el numero 2: ");
		number2 = numero2.nextInt();
		
		int suma = number1 + number2;
		
		System.out.println("La suma de los dos numeros es: "+suma);
		float numero;
		try {
			System.out.println("Digite un numero: ");
			numero = entrada.nextFloat();
			System.out.println("Numero ingresado por el Usuario: "+numero);
		}catch (Exception e) {
			System.out.println("No haz intriducido un formato correcto");
		}
	}

}
