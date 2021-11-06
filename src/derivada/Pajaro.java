package derivada;

import base.Animal;

public class Pajaro extends Animal{

	private double alturaDeVueloMax;
	
	public Pajaro(int edad, double alturaDeVueloMax) {
		this.edad = edad;
		this.alturaDeVueloMax = alturaDeVueloMax;
	}

	@Override
	public void comer() {
		System.out.println("El pajaro est� comiendo...");
	}

	@Override
	public void dormir() {
		System.out.println("El pajaro est� durmiendo...");
	}

	@Override
	public Integer getEdad() {
		return edad;
	}
	
	public double getAlturaDeVueloMax() {
		return alturaDeVueloMax;
	}
}
