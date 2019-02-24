package br.com.johny.app;

public class Aula implements Comparable<Aula> {

	private String titulo;
	
	private int tempo;

	public Aula(String titulo, int tempo) {
		super();
		try {
			if (titulo == null) {
				throw new Exception("Titulo nao pode ser nulo!");
			}
			this.titulo = titulo;
			this.tempo = tempo;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}	
	
	@Override
	public String toString() {
		return "Aula " + this.titulo + " - " + this.tempo + " minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}