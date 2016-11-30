package exer3;

public class Endereco {
	/**
	 * 
	 * 
	 */
	
	
	private String cep;
	private String rua;
	private String bairro;
	private String complemento;
	
	/**
	 * Construtor sem parametro  que inicia os atributos
	 * 
	 */
	public Endereco() {
		this.cep = "";
		this.rua = "";
		this.bairro = "";
		this.complemento = "";
	}
	
	
	/**
	 * Construtor com parametro  que inicia os atributos
	 * 
	 * @param cep
	 * @param rua
	 * @param bairro
	 * @param complemento
	 */
	public Endereco(String cep, String rua, String bairro, String complemento) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	/**
	 * método toString que permite o objeto Enderço seja mostrado na tela 
	 */
	@Override
	public String toString() {
		return "Endereco [CEP=" + cep + ", rua=" + rua + ", bairro=" + bairro + ", complemento=" + complemento + "]\n";
	}
	public String getCEP() {
		return cep;
	}
	public void setCEP(String cEP) {
		cep = cEP;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	
	

}

