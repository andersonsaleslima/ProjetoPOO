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

	public ColecaoConsultas(ArrayList<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}

	public void adicionaConsulta(Consulta consulta){
		if(!listaConsultas.contains(consulta)){
			listaConsultas.add(consulta);
			System.out.println("Consulta adicionada.");
	    }else{
	        System.out.println( "Esta consulta já foi adicionada");
	    }

		
	}

	public void qtdConsultasData(LocalDate data){
		int cont=0;
		for (Consulta consulta : listaConsultas) {
				if(consulta.getData().equals(data)){
					cont++;
				System.out.println("Quantidade de consultas na data: "+consulta.getData()+" foi: "+cont);
			}
		}

	}

	public void listagemConsultas(){

		for (Consulta consulta : listaConsultas) {

			System.out.println(consulta.toString());

		}


	}

	public void qtdConsultasPorMedico(String nome, String crm){

		int cont=0;
		
		for (Consulta consulta : listaConsultas) {
			if (consulta.getMedico().getNome().equalsIgnoreCase(nome)&&consulta.getMedico().getCrm().equalsIgnoreCase(crm))
				cont++;
		}
		
		System.out.println("O Médico: "+nome+" Fez: "+cont+" Consultas");
		

	}

	public void listaConsultasPorPaciente(String nome, String documento){
		
	int cont=0;
		
		for (Consulta consulta : listaConsultas) {
			if (consulta.getPaciente().getNome().equalsIgnoreCase(nome)&&consulta.getPaciente().getDocumento().equalsIgnoreCase(documento))
				cont++;
		}
		
		System.out.println("O Paciente: "+nome+" Fez: "+cont+" Consultas");
		

	}

	}



