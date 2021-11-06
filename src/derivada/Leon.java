package derivada;

import base.Animal;

public class Leon extends Animal{
	
	private double peso;
	
	public Leon(int edad, double peso) {
		this.edad = edad;
		this.peso = peso;
	}

	@Override
	public void comer() {
		System.out.println("El leon est� comiendo...");
	}

	@Override
	public void dormir() {
		System.out.println("El leon est� durmiendo...");
	}

	@Override
	public Integer getEdad() {
		return edad;
	}
	
	public double getPeso() {
		return peso;
	}
}
