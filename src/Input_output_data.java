import javax.swing.JOptionPane;

public class Input_output_data {

	public static void main(String[] args) {
		/*String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero Double: "));
		letra = JOptionPane.showInputDialog("Digite un caracter:_").charAt(0);
		//System.out.println("Valor 1: "+entero +"\n"+ "Valor 2: "+cadena);
		
		JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);*/
		
		float cal1, cal2, cal3;
		
		cal1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su calificacion 1: "));
		cal2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su calificacion 1: "));
		cal3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su calificacion 1: "));
		
		float promedio = 0;
		
		promedio = (cal1 + cal2 + cal3) / 3;
		
		if(promedio > 7) {
			JOptionPane.showMessageDialog(null, "Tu promedio es: "+promedio); 
		}else {
			JOptionPane.showMessageDialog(null, "Reprobaste"); 
		}
	}

}
