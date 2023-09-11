package Punto2;

import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		
		int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la canitdad de caracteres del arreglo"));
		
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] suma=new int[n];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" del primer arreglo"));
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" del segundo arreglo"));
		}
		
		System.out.println("Arreglo 1");
		arregloImp(arr1);
		
		System.out.println("Arreglo 2");
		arregloImp(arr2);
		
		
		for (int i = 0; i < suma.length; i++) {
			suma[i]=arr1[i]+arr2[i];
		}
		System.out.println("La suma de los arreglos es: ");
		arregloImp(suma);
		
	}
	public static void arregloImp(int[] arreglo) {
		for (int num : arreglo) {
			System.out.println(num+" ");
		}
		System.out.println();
	}
	
}
