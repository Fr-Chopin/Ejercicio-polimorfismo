package derivada;

import base.Animal;

public class Tigre extends Animal{
	
	private String colorDePelo;
	
	public Tigre(int edad, String colorDePelo) {
		this.edad = edad;
		this.colorDePelo = colorDePelo;
	}

	@Override
	public void comer() {
		System.out.println("El tigre est� comiendo...");
	}

	@Override
	public void dormir() {
		System.out.println("El tigre est� durmiendo...");
	}

	@Override
	public Integer getEdad() {
		return edad;
	}
	
	public String getColorDePelo() {
		return colorDePelo;
	}
}
