import javax.swing.JOptionPane;

public class Aplicacion {
	
	/*
	 * haga un algoritmo que solicite las notas de n 
	 * estudiantes y calcule el promedio de ellas
	 * 
	 * valide que las notas se encuentren entre 0 y 5
	 */

	public static void main(String[] args) {
		
		double notas[]=new double[5];
		
		for(int i=0;i<5;i++){
			notas[i]=Double.parseDouble(
					JOptionPane.showInputDialog("Ingrese"
							+ " nota "+(i+1)));	
		}
	
		System.out.println("CONTENIDO DEL ARREGLO DE"
				+ " TAMAÑO: "+notas.length);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("notas["+i+"] = "+notas[i]);
		}
		

	}

}
