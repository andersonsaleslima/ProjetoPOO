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
	 * M�todo que primeiro verifica se na lista j� existe o m�dico, caso n�o ele adciona
	 * @param medico representa um m�dico 
	 */

	public void adicionaMedico(Medico medico){
		if(!listaMedicos.contains(medico)){
			listaMedicos.add(medico);
			System.out.println("*M�dico adicionado*");
	    }else{
	        System.out.println( "*Este M�dico j� foi adicionado*");
	    }
	}

	
	/**
	 * M�todo que faz uma pesquisa na lista de m�dico e mostra o que tiver 
	 * exatamente o crm igual ao que foi passado como parametro.
	 * 
	 * @param crm representa o crm do m�dico
	 */
	public void pesquisaPeloCRM(String crm){

		for (Medico medico : listaMedicos) {

			if (medico.getCrm().equalsIgnoreCase(crm)){

				System.out.println(medico.toString());
			}
		}

	}
	
	
/**
 * M�todo que pesquisa um m�dico por parte do nome, ser� mostrado todos que 
 * tiverem essa parte do nome
 * @param nome representa parte do nome do m�dico
 */
	public void pesquisaMedicoPorParteDoNome(String nome){


		for (Medico medico : listaMedicos) {

			if (medico.getNome().contains(nome)){

				System.out.println(medico.toString());


			}
		}
	}

}

