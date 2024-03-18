package repasoFormas;

public class Circulo {
//Parte privada----------------------
	private double diametro;
	
//Parte publica----------------------------------------------	
	//Constructor
	public Circulo(double r) {
		diametro= 2 * r;
	}
	
	
	//Metodos
	public double obtenerDiametro() {
		return diametro;
	}
	public double obtenerRadio() {
		return diametro /2;
	}
	public double obtenerPerimetro() {
		return 2 * Math.PI * obtenerRadio();
	}
	public double obtenerArea() {
		return Math.PI * obtenerRadio() * obtenerRadio();
	}
	
	public static void main(String[] args) {
		Circulo circu = new Circulo(2);
		Circulo circulong = new Circulo(9);
		System.out.println(circulong.obtenerArea());
		System.out.println(circu.obtenerDiametro());
	}
}
