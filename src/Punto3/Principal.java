package Punto3;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int cantidadEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de empleados a ingresar"));
		double estrato1A2=0.02, estrato3A4=0.04, estrato5=0.08, estrato6=0.1;
		
		
		HashMap<String, Double> mapEmpleados=new HashMap<String, Double>();
		
		for (int i = 0; i < cantidadEmpleados; i++) {
			String nombre=JOptionPane.showInputDialog("Nombre del empleado "+(i+1));
			int estrato=Integer.parseInt(JOptionPane.showInputDialog("Estrato del empleado "+(i+1)));
			double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Sueldo del empleado "+(i+1)));
			double sueldoTotal = 0;
		
			switch (estrato) {
			case 1:
			case 2:
				sueldoTotal=sueldo-(sueldo*estrato1A2);
				break;
			case 3:
			case 4:
				sueldoTotal=sueldo-(sueldo*estrato3A4);
				break;
			case 5:
				sueldoTotal=sueldo-(sueldo*estrato5);
				break;
			case 6:
				sueldoTotal=sueldo-(sueldo*estrato6);
				break;
			default:
				JOptionPane.showMessageDialog(null, "NUMERO DE ESTRATO NO VALIDO", "Error", JOptionPane.ERROR_MESSAGE);
				i--;
				break;
			}
			
			mapEmpleados.put(nombre, sueldoTotal);
			
		}
		
		for (Map.Entry<String, Double> entry : mapEmpleados.entrySet()) {
			String nombre = entry.getKey();
			Double sueldoTotal = entry.getValue();
			
			System.out.println(nombre+ " con el descuento, su sueldo ahora es de: $"+sueldoTotal);
			
		}
	}
}
