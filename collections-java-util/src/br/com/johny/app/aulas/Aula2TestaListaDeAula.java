package br.com.johny.app.aulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.johny.app.models.Aula;

public class Aula2TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Zzz Revisitando as Arraylists", 21);
		Aula a2 = new Aula("Aaa Lista de objetos", 25);
		Aula a3 = new Aula("XX Relacionamentos listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		getLogsAula(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		getLogsAula(aulas);
	}
	
	private static void getLogsAula(List<Aula> aulas) {
		aulas.forEach(aula-> {
			System.out.println(aula);
		});
		System.out.println("\n");
	}
	
}
