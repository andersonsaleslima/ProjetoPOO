package exer3;


import java.time.LocalDate;
import java.util.ArrayList;

public class ColecaoConsultas {

	private ArrayList<Consulta> listaConsultas;




	/**
	 * @param listaConsultas
	 */
	public ColecaoConsultas() {
		listaConsultas=new ArrayList<Consulta>();
	}

	
	/**
	 * Construtor que inicializa a lista de consultas ele recebe uma lista como parametro
	 * 
	 * 
	 * @param listaConsultas
	 */
	public ColecaoConsultas(ArrayList<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}

	
	/**
	 * Método que cadastra uma consulta, mas primeiro verifica se ja existe uma cadastrada
	 * 
	 * @param consulta
	 */
	public void adicionaConsulta(Consulta consulta){
		if(!listaConsultas.contains(consulta)){
			listaConsultas.add(consulta);
			System.out.println("Consulta adicionada.");
		}else{
			System.out.println( "Esta consulta já foi adicionada");
		}


	}

	/**
	 * Método que lista consultas a partir de uma data passada por parametro
	 * 
	 * @param data
	 */
	public void qtdConsultasData(LocalDate data){
		int cont=0;
		for (Consulta consulta : listaConsultas) {
			if(consulta.getData().equals(data)){
				cont++;
				System.out.println("Quantidade de consultas na data: "+consulta.getData()+" foi: "+cont);
			}
		}

	}
	
	/**
	 * 
	 * Método que mostra todas as consultas cadastradas
	 * 
	 * 
	 * 
	 */

	public void listagemConsultas(){

		for (Consulta consulta : listaConsultas) {

			System.out.println(consulta.toString());

		}


	}

	/***
	 * Método lista as consultas por médicos de acordo com o nome e crm do pra
	 * se for igual
	 * @param nome
	 * @param crm
	 */

	public void qtdConsultasPorMedico(String nome, String crm){

		int cont=0;

		for (Consulta consulta : listaConsultas) {
			if (consulta.getMedico().getNome().equalsIgnoreCase(nome)&&consulta.getMedico().getCrm().equalsIgnoreCase(crm))
				cont++;
		}

		System.out.println("O Médico: "+nome+" Fez: "+cont+" Consultas");


	}
	/**
	 * Método lista as consultas pelo paciente, será passado o nome e o documento
	 * 
	 * @param nome
	 * @param documento
	 */
	public void listaConsultasPorPaciente(String nome, String documento){

		int cont=0;

		for (Consulta consulta : listaConsultas) {
			if (consulta.getPaciente().getNome().equalsIgnoreCase(nome)&&consulta.getPaciente().getDocumento().equalsIgnoreCase(documento))
				cont++;
		}

		System.out.println("O Paciente: "+nome+" Fez: "+cont+" Consultas");


	}

}



