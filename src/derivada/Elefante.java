package derivada;

import base.Animal;

public class Elefante extends Animal{

	private double tamanioDeTrompa;
	
	public Elefante(int edad, double tamanioDeTrompa) {
		this.edad = edad;
		this.tamanioDeTrompa = tamanioDeTrompa;
	}

	@Override
	public void comer() {
		System.out.println("El elefante está comiendo...");
	}

	@Override
	public void dormir() {
		System.out.println("El elefante está durmiendo...");
	}

	@Override
	public Integer getEdad() {
		return edad;
	}
	
	public double getTamanioDeTrompa() {
		return tamanioDeTrompa;
	}
	
}
