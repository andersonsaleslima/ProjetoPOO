package exer3;
import java.time.LocalDate;
import java.time.Period;

public class Paciente {



	private String nome;
	private LocalDate dataNasc;
	private String documento;
	private Endereco endereco;
	private String sexo;




	/**
	 * @param endereco
	 * @param sexo
	 * @param nome
	 * @param dataNasc
	 * @param documento
	 */

	public Paciente() {
		this.endereco = null;
		this.sexo = "";
		this.nome = "";
		this.dataNasc = null;
		this.documento = "";
	}

	public Paciente(Endereco endereco, String sexo, String nome, LocalDate data, String documento) {
		this.endereco = endereco;
		this.sexo = sexo;
		this.nome = nome;
		this.dataNasc = data;
		this.documento = documento;
	}


	public String nomeFormatado(){

		String[] parts = this.nome.split(" ");
		String nome = new String();
		String nome1= new String();
		for(int i=0;i<parts.length;i++){
			nome=parts[parts.length-1]+", ";

			nome1+=parts[i].substring(0,1)+". ";

		}

		return nome+nome1 ;	

	}



	public int idade(){


		LocalDate dataHj= LocalDate.now();

		Period p=Period.between(this.dataNasc, dataHj);
		System.out.println(p.getYears());


		return p.getYears();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Paciente [endereco=" + endereco.toString() + ", sexo=" + sexo + ", nome=" + nome + ", data=" + dataNasc
				+ ", documento=" + documento + "]\n";
	}



	public String getDocumento() {
		return documento;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public String getSexo() {
		return sexo;
	}


	public String getNome() {
		return nome;
	}


	public LocalDate getData() {
		return dataNasc;
	}





}
