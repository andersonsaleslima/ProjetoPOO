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
	public void adicionarPaciente(Paciente p){

		listaPacientes.add(p);

	}

	public void pesquisaPeloDocumento(String documento){

		for (Paciente paciente : listaPacientes) {

			if (paciente.getDocumento().equalsIgnoreCase(documento))

				System.out.println(paciente.toString());
			else
				System.out.println("N�o existe Documento");
		}
	}


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


	public void listagemPacientesComEndereco(){

		for (Paciente paciente : listaPacientes) {

			if(!paciente.getEndereco().equals(null))

				System.out.println(paciente.toString());

		}



	}

	public void listagemDePacientesMaioresDe60anos(){

		for (Paciente paciente : listaPacientes) {

			if(paciente.idade()>60){

				System.out.println("Paciente com mais de 60 Anos: "+paciente.toString());
			}else
				System.out.println("N�o h� pacientes com mais de 60 anos");
		}
	}

}
