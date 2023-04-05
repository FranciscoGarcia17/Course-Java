import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Elaborar un programa que calcule e imprima la suma de tres calificaciones
		
		//Ejercicio en consola
		Scanner entrada = new Scanner(System.in);
		int cal1, cal2, cal3, suma1;
		System.out.println("Digita tus tres calificaiones: ");
		cal1 = entrada.nextInt();
		cal2 = entrada.nextInt();
		cal3 = entrada.nextInt();
		
		suma1 = cal1 + cal2 + cal3;
		System.out.println(suma1);
		
		//Ejercicio con Interfaz Grafica
		float cali1, cali2, cali3, suma;
		cali1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion 1:"));
		cali2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion 2:"));
		cali3 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion 3:"));
		
		suma = cal1 + cal2 + cal3;
		
		JOptionPane.showMessageDialog(null, "Suma de calificaiones: "+suma);
		
		
		/*Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empelado
		 * a partir de sus horas semanales trabajadas y de su salario por hora.
		 */
		
		String nombre;
		int horas;
		float salario_Hora, sueldo;
		
		nombre = JOptionPane.showInputDialog("Ingresa tu Nombre: ");
		horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas tranajaste: "));
		salario_Hora = Float.parseFloat(JOptionPane.showInputDialog("Cual es tu salario por hora: "));
		
		sueldo = salario_Hora * horas;
		
		JOptionPane.showMessageDialog(null, " "+nombre + "\n tu salario es de: "+sueldo);
	}

}
