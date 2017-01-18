package exer3;

public class Medico {

	/**
	 * @param crm  do médico
	 * @param nome do médico
	 * @param especialidade do médico
	 */
	
	private String crm;
	private String nome;
	private String especialidade;



	
	public Medico() {
		this.crm = "";
		this.nome = "";
		this.especialidade = "";
	}
	
	/**
	 *@param crm representa o crm do medico
	 * @param nome representa o nome do médico
	 * @param especialidade representa a especialidade do médico
	 */
	public Medico(String crm, String nome, String especialidade) {
		this.crm = crm;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Medico))
			return false;
		Medico other = (Medico) obj;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (especialidade == null) {
			if (other.especialidade != null)
				return false;
		} else if (!especialidade.equals(other.especialidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", especialidade=" + especialidade + "]\n";
	}





	public String getCrm() {
		return crm;
	}


	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}




}
