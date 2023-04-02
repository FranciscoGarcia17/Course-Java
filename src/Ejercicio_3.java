
import javax.swing.JOptionPane;

public class Ejercicio_3 {

	public static void main(String[] args) {
		/*
		float guillermo, juan, luis, suma;
		
		guillermo = Float.parseFloat(JOptionPane.showInputDialog("Guillermo Ingresa de dolares: "));
		
		luis = guillermo / 2;
		
		juan = (guillermo + luis) / 2;
		
		suma = guillermo + luis + juan;
		
		JOptionPane.showMessageDialog(null, "La suma de los tres es: "+suma);*/
		
		int salario = 1000, comision = 150;
		
		int empleado = Integer.parseInt(JOptionPane.showInputDialog("Cuantos carros Vendiste este mes: ?"));
		double newComision = comision * empleado;
		double newResult = Double.parseDouble(JOptionPane.showInputDialog("Cual fue el precio de los carros que vendiste: "));
		double salarioFinal = ((newResult * empleado));
		System.out.println(salarioFinal);
		double salarioFinal1 = (salarioFinal + newComision) + salario;
		
		JOptionPane.showMessageDialog(null, "Salario Final: "+salarioFinal1);
	}

}
