package br.com.johny.app;

import java.util.ArrayList;
import java.util.Collections;

public class Aula1TesteListas {
	public static ArrayList<String> materias = new ArrayList<String>();

	public static void main(String[] args) {
		getMaterias();
		
//		Collections.sort(materias, Collections.reverseOrder());
		materias.sort(Collections.reverseOrder());
		
		materias.forEach(materias -> {
			System.out.println("Materia = " + materias);
		});
		
	}

	private static void getMaterias() {
		materias.add("Matematica");
		materias.add("Portugues");
		materias.add("Fisica");
		materias.add("Quimica");
		materias.add("Biologia");
		materias.add("Artes");
		materias.add("Historia");
	}
}
