package controller;

import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class ColecaoVeiculo {
	private  List<Veiculo> auto = new ArrayList<Veiculo>();
	private List<Veiculo> moto =  new ArrayList<Veiculo>();
	
	public boolean adicionarAutomovel(Placa placa, boolean disponibilidade, String marca, String modelo, double precoPorHra,
			int qtdDePortas, int numeroDePassageiros) {
			if(placa != null){
			
				this.auto.add(new Automovel(placa, disponibilidade, marca, modelo, precoPorHra, qtdDePortas,
						numeroDePassageiros) );
				return true;
			}
			return false;
	}
	
	public boolean adicionarMoto(Placa placa, boolean disponibilidade, String marca, String modelo, double precoPorHra,
			String estilo) {
			if(placa != null){
			
				this.moto.add(new Motocicleta(placa, disponibilidade, marca, modelo, precoPorHra, estilo) );
				return true;
			}
			return false;
	}

	public Automovel pesquisaAutomovelPelaPlaca(Placa placa){
		int i;
		Automovel auto;
	
		for( i = 0; i < this.auto.size(); i++){
			auto = (Automovel) this.auto.get(i);
			if(auto.getPlaca().equals(placa)){
				//System.out.println(this.paciente.get(i));
				return auto;
			}
		}
		return null;
	}
	
	public Motocicleta pesquisaMotocicletaPelaPlaca(Placa placa){
		int i;
		Motocicleta moto;
	
		for( i = 0; i < this.auto.size(); i++){
			moto = (Motocicleta) this.moto.get(i);
			if(moto.getPlaca().equals(placa)){
				//System.out.println(this.paciente.get(i));
				return moto;
			}
		}
		return null;
	}


	public boolean removeAutomovelPelaPlaca(Placa placa){
		int i;
		for( i = 0; i < this.auto.size(); i++){
			Automovel auto = (Automovel) this.auto.get(i);
			if(auto.getPlaca().equals(placa)){
				this.auto.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeMotocicletaPeloPlaca(Placa placa){
		int i;
		for( i = 0; i < this.moto.size(); i++){
			Motocicleta moto = (Motocicleta) this.moto.get(i);
			if(moto.getPlaca().equals(placa)){
				this.moto.remove(i);
				return true;
			}
		}
		return false;
	}
	

	public void listagemAutomovel(){
		Automovel auto;
		
		System.out.println();
		for(int i = 0; i< this.auto.size(); i++){
			auto = (Automovel) this.auto.get(i);
			System.out.println(auto);
		}
	}
	
	
	public void listagemMotocicleta(){
		Motocicleta moto;
		
		System.out.println();
		for(int i = 0; i< this.moto.size(); i++){
			moto = (Motocicleta) this.moto.get(i);
			System.out.println(moto);
		}
	}
}
