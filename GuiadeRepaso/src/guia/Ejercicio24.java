package guia;

public class Ejercicio24 {
	
	//Escribir una función que reciba un arreglo de enteros 
	//y devuelva true si el arreglo está ordenado 
	//de mayor a menor y false
	
//	public static boolean estaOrdenado (int [] v) {
//		for (int i = 0 ; i < v.length - 1;i++) {
//			if (v[i] < v[i+1]) {
//				return false;
//			}
//			
//		}
//		return true;
//	}
	public static boolean estaOrdenado (int [] v) {
		boolean ordenado = true;
		int i = 0;
		while (i < v.length -1 && ordenado)  {
			ordenado = v[i] >= v[i+1];
			i++;
		}
		return ordenado;
	}
	
	
	public static void main(String[] args) {
		
		int [] vectorito = {9,7,5,4,3,2,1};
		int [] a = {1,1,1,1,1,1,1};
		int [] cuatro = {4};
		int [] desor = {1,6,7,3,2,5};
		System.out.println(estaOrdenado(a));
		System.out.println(estaOrdenado(vectorito));
		System.out.println(estaOrdenado(cuatro));
		System.out.println(estaOrdenado(desor));
		
	}

}
