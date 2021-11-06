import java.util.List;

import java.util.ArrayList;

import base.Animal;
import derivada.*;


public class Principal {

	public static void main(String[] args) {
		
		List<Animal> zoologico = new ArrayList<Animal>();

		zoologico.add(new Leon(7, 185.2));
		zoologico.add(new Leon(16, 214.8));
		zoologico.add(new Leon(15, 201.3));
		
		zoologico.add(new Tigre(8, "claro"));
		zoologico.add(new Tigre(12, "oscuro"));
		
		zoologico.add(new Pajaro(39, 257));
		zoologico.add(new Pajaro(15, 233));
		zoologico.add(new Pajaro(36, 240));
		zoologico.add(new Pajaro(37, 199));
		
		zoologico.add(new Elefante(56, 2.3));
		zoologico.add(new Elefante(13, 1.6));
		
		
		
		zoologico.sort((a1, a2) -> a1.getEdad().compareTo(a2.getEdad()));
		
		System.out.println("Edad de los animales de forma ascendente: ");
		
		for (Animal animal : zoologico) {
			System.out.println(animal.getEdad());
		}
		System.out.println("-----------------------------");
		
		
		
		zoologico.sort((a1, a2) -> a2.getEdad().compareTo(a1.getEdad()));
		
		System.out.println("Edad de los animales de forma descendente: ");
		
		for (Animal animal : zoologico) {
			System.out.println(animal.getEdad());
		}
		System.out.println("-----------------------------");
		
		
		
		long cantidadLeon = zoologico.stream()
				.filter((animal) -> animal instanceof Leon && ((Leon) animal).getPeso() > 200)
				.count();
			
		System.out.println("La cantidad de leones que pesan mas de 200kg son: " + cantidadLeon);
		
		System.out.println("-----------------------------");
		
		
		
		long cantidadTigre = zoologico.stream()
				.filter((animal) -> animal instanceof Tigre && ((Tigre) animal).getColorDePelo().equalsIgnoreCase("oscuro"))
				.count();
		
		System.out.println("La cantidad de tigres con pelo oscuro: " + cantidadTigre);
		
		System.out.println("-----------------------------");
		
		
		
		long cantidadPajaro = zoologico.stream()
				.filter((animal) -> animal instanceof Pajaro   &&   ((Pajaro) animal).getAlturaDeVueloMax() > 200  &&  animal.getEdad() > 35)
				.count();
		
		System.out.println("Cantidad de pajaros que sobrevuelan los 200 metros y tiene mas de 35 años: " + cantidadPajaro);
		
		System.out.println("-----------------------------");
		
		
		
		for (Animal animal : zoologico) {
			if(animal instanceof Elefante  &&  ((Elefante) animal).getTamanioDeTrompa() > 2) {
				System.out.println("Este elefante tiene mas de 2 metros de trompa!");
			}else if(animal instanceof Elefante) {
				System.out.println("Este elefante no tiene mas de 2 metros de trompa..");
			}
			
			
		}
	}

}
