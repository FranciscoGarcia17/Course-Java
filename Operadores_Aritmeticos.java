import java.util.Iterator;
import java.util.Scanner;

public class Operadores_Aritmeticos {

	public static void main(String[] args) {
		/*Scanner entrada = new Scanner(System.in);
		float numero1, numero2, suma, resta, mult, div, resto;
		
		System.out.println("Digite 2 numeros: ");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		mult = numero1 * numero2;
		div = numero1 / numero2;
		resto = numero1%numero2;*/
		
		
	for (int i = 1; i <= 100; i++) {
		if(i%2 == 0) {
			System.out.println("Numero par" +i);
		}else {
			System.out.println("Numero impar" +i);
		}
	}
	
	//Operadores Aritmeticos combinados con asignacion
	int numero = 10;
	
	numero += 5;
	numero -= 2;
	numero *= 2;
	numero /= 1;
	numero %=1;
	
	System.out.println(numero);
	
	//Operadores de Incremento y Decremento
	int valor = 5, y;
	/*
	valor++;
	valor--;
	*/
	
	y = valor++; //Aqui primero se pasa el valor de valor a y y despues valor se incrementa uno
	System.out.println(y);
	System.out.println(valor);
	y = ++valor; //Aqui primero se le aumenta el valor de 5 a 6 y se le asgina a y; //Prefijo
	System.out.println(y);
	System.out.println(valor);
	
	
	
	}

}
