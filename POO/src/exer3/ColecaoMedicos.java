package exer3;


import java.util.ArrayList;

public class ColecaoMedicos {

	private ArrayList<Medico>listaMedicos;


	public ColecaoMedicos() {
		listaMedicos=new ArrayList<Medico>();
	}

	/**construtor que recebe uma lista de medicos como parametro
	 * 
	 * @param listaMedicos representa uma lista de medicos
	 */
	public ColecaoMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}
	
	/**
	 * 
	 * Método que primeiro verifica se na lista já existe o médico, caso não ele adciona
	 * @param medico representa um médico 
	 */

	public void adicionaMedico(Medico medico){
		if(!listaMedicos.contains(medico)){
			listaMedicos.add(medico);
			System.out.println("*Médico adicionado*");
	    }else{
	        System.out.println( "*Este Médico já foi adicionado*");
	    }
	}

	
	/**
	 * Método que faz uma pesquisa na lista de médico e mostra o que tiver 
	 * exatamente o crm igual ao que foi passado como parametro.
	 * 
	 * @param crm representa o crm do médico
	 */
	public void pesquisaPeloCRM(String crm){

		for (Medico medico : listaMedicos) {

			if (medico.getCrm().equalsIgnoreCase(crm)){

				System.out.println(medico.toString());
			}
		}

	}
	
	
/**
 * Método que pesquisa um médico por parte do nome, será mostrado todos que 
 * tiverem essa parte do nome
 * @param nome representa parte do nome do médico
 */
	public void pesquisaMedicoPorParteDoNome(String nome){


		for (Medico medico : listaMedicos) {

			if (medico.getNome().contains(nome)){

				System.out.println(medico.toString());


			}
		}
	}

}

