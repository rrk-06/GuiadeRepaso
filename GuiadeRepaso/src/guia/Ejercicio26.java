package guia;

public class Ejercicio26 {
//	Implementar una función que reciba como parámetro
//	un arreglo de enteros y muestre por pantalla 
//	cuántas veces se repite cada uno. 
//	El arreglo no está ordenado. 
//	Se garantiza que los números estan comprendidos 
//	entre 0 y 100.

	public static void frecu (int [] v) {
		int [] frecuencias = new int [101];
		for (int i = 0; i < v.length; i++) {
			frecuencias[v[i]]++;
			
		}
		for (int x = 0; x < frecuencias.length; x++) {
			if (frecuencias[x] != 0) {
			System.out.println("El valor "+ x + "se repite " + frecuencias[x] + "veces");
		}
	}
}
	
	public static void main(String[] args) {
		
		
		int [] Ordenao = {1,4,5,2,3,4,5,6,3,3,4,5,6};
		frecu(Ordenao);
		int [] nulo = {};
		frecu(nulo);
		
	}
}
