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

		listaConsultas.add(consulta);
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

	public void qtdConsultasPorMedico(){
		@SuppressWarnings("unused")
		int cont=0;
		for(int i=0; i<listaConsultas.size();i++){

			for(int j=0; j<listaConsultas.size();j++){

				if (listaConsultas.get(i).getMedico().equals(listaConsultas.get(j).getMedico())){
					cont++;

				}
				

			}
			cont=0;
		}

	}

	public void listaConsultasPorPaciente(){

		for(int i=0; i<listaConsultas.size();i++){

			for(int j=0; j<listaConsultas.size();j++){

				if (listaConsultas.get(i).getPaciente().equals(listaConsultas.get(j).getPaciente())){

					System.out.println(listaConsultas.get(j).getPaciente()+"\n");
				}

			}
		}
	}

}

