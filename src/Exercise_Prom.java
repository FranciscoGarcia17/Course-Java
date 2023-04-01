import java.util.Scanner;

public class Exercise_Prom {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		
		float cal1, cal2, cal3;
		
		System.out.print("Ingrese la calificacion 1: ");
		cal1 = entrada1.nextFloat();
		
		System.out.print("Ingrese la calificacion 2: ");
		cal2 = entrada1.nextFloat();
		
		System.out.print("Ingrese la calificacion 3: ");
		cal3 = entrada1.nextFloat();
		
		float promedio = ((cal1 + cal2 + cal3) / 3f);
		System.out.println("Promedio: "+promedio);
		
		if(promedio > 7) {
			System.out.println("Aprobaste");
		}else {
			System.out.println("Reporbaste");
		}
	}

}
