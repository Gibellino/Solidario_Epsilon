package model;

public class Entidade{

	int id_Entidade;
	String primeiro_Nome, ultimo_Nome;
	
	
	public Entidade(int id_Entidade, String primeiro_Nome, String ultimo_Nome) {
		this.id_Entidade = id_Entidade;
		this.primeiro_Nome = primeiro_Nome;
		this.ultimo_Nome = ultimo_Nome;
	}

	public int getId_Entidade() {
		return id_Entidade;
	}

	public String getPrimeiro_Nome() {
		return primeiro_Nome;
	}

	public String getUltimo_Nome() {
		return ultimo_Nome;
	}

	public void setId_Entidade(int id_Entidade) {
		this.id_Entidade = id_Entidade;
	}

	public void setPrimeiro_Nome(String primeiro_Nome) {
		this.primeiro_Nome = primeiro_Nome;
	}

	public void setUltimo_Nome(String ultimo_Nome) {
		this.ultimo_Nome = ultimo_Nome;
	}

}
