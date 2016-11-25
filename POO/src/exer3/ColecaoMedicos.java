package exer3;


import java.util.ArrayList;

public class ColecaoMedicos {

	private ArrayList<Medico>listaMedicos;


	public ColecaoMedicos() {
		listaMedicos=new ArrayList<Medico>();
	}

	/**
	 * @param listaMedicos
	 */
	public ColecaoMedicos(ArrayList<Medico> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}

	public void adicionaMedico(Medico medico){
		listaMedicos.add(medico);

	}

	public void pesquisaPeloCRM(String crm){

		for (Medico medico : listaMedicos) {

			if (medico.getCrm().equalsIgnoreCase(crm)){

				System.out.println(medico.toString());
			}
		}

	}
	
	

	public void pesquisaMedicoPorParteDoNome(String nome){


		for (Medico medico : listaMedicos) {

			if (medico.getNome().contains(nome)){

				System.out.println(medico.toString());


			}
		}
	}

}

