package exer3;


import java.util.ArrayList;

public class ColecaoPacientes {

	private ArrayList<Paciente> listaPacientes;


	public ColecaoPacientes() {
		this.listaPacientes = new ArrayList<Paciente>();
	}

	/**
	 * @param listaPacientes
	 */
	/*	public ColecaoPacientes(ArrayList<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	 */
	/**
	 * M�todo que recebe como paramentro um paciente verifica se o mesmo j� existe na lista se n�o
	 * existir, ser� adcionado.
	 * @param p representa um paciente 
	 */
	public void adicionarPaciente(Paciente p){

		if(!listaPacientes.contains(p)){
			listaPacientes.add(p);
			System.out.println("Paciente adicionado.");
	    }else{
	        System.out.println( "Este Paciente j� foi adicionado");
	    }
	}

	/**
	 * M�todo que pesquisa um paciente de acordo com o documento passado como paramentro
	 * @param documento repesenta um documento de um paciente
	 */
	public void pesquisaPeloDocumento(String documento){

		for (Paciente paciente : listaPacientes) {

			if (paciente.getDocumento().equalsIgnoreCase(documento))

				System.out.println(paciente.toString());
			else
				System.out.println("N�o existe Documento");
		}
	}

	
/**
 * 
 * M�todo que remove um paciente de acordo com o documento passado como parametro
 * 
 * @param documento representa o documento do paciente
 */
	public void removePeloDocumento(String documento){

		for (Paciente paciente : listaPacientes) {

			if (paciente.getDocumento().equalsIgnoreCase(documento)){
				
				listaPacientes.remove(paciente.toString());
				System.out.println("O paciente "+paciente.getNome()+" foi Removido");

			}
			else{
				System.out.println("N�o foi encontrado paciente");
			}

		}


	}

	
	/**
	 * 
	 * M�todo que faz lista quantidade de pessoas de acordo com sexo
	 * 
	 */
	public void qtdPacientesPorSexo(){
		int masc=0;
		int fem=0;
		for (Paciente paciente : listaPacientes) {
			if (paciente.getSexo().equalsIgnoreCase("Masculino")||paciente.getSexo().equalsIgnoreCase("M")) {
				masc++;
			}
			if (paciente.getSexo().equalsIgnoreCase("Feminino")||paciente.getSexo().equalsIgnoreCase("F")) {
				fem++;
			}
			
		}
		
		System.out.println("Quantidade Masculino: "+masc+"\nQuantidade Feminino: "+fem);



	}

	
	/**
	 * M�todo que lista os pacientes que tem endere�o
	 */

	public void listagemPacientesComEndereco(){

		for (Paciente paciente : listaPacientes) {

			if(!paciente.getEndereco().equals(null))

				System.out.println(paciente.toString());

		}



	}
	
	/**
	 * Lista os pacientes que tem mais 60 anos
	 * o m�todo compara a idade de cada paciente 
	 * 
	 * 
	 */

	public void listagemDePacientesMaioresDe60anos(){

		for (Paciente paciente : listaPacientes) {

			if(paciente.idade()>60){

				System.out.println("Paciente com mais de 60 Anos: "+paciente.toString());
			}else
				System.out.println("N�o h� pacientes com mais de 60 anos");
		}
	}

}
