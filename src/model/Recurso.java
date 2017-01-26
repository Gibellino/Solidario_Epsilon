package model;

public class Recurso {

	int idRecurso;
	String nome;
	
	public Recurso(int idRecurso, String nome) {
		super();
		this.idRecurso = idRecurso;
		this.nome = nome;
	}

	public int getIdRecurso() {
		return idRecurso;
	}

	public String getNome() {
		return nome;
	}

	public void setIdRecurso(int idRecurso) {
		this.idRecurso = idRecurso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
