package controller;

import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class ColecaoVeiculo {
	private List<Veiculo> auto = new ArrayList<Veiculo>();
	private List<Veiculo> moto =  new ArrayList<Veiculo>();
	
	public boolean adicionarAutomovel(Placa placa, String marca, String modelo, double precoPorHra,
			int qtdDePortas, int numeroDePassageiros) {
		
			if((placa != null )){
			
				this.auto.add(new Automovel(placa, marca, modelo, precoPorHra, qtdDePortas,
						numeroDePassageiros) );
				return true;
			}
			return false;
	}
	
	public boolean adicionarMotocicleta(Placa placa, String marca, String modelo, double precoPorHra,
			String estilo) {
			if(placa != null){
			
				this.moto.add(new Motocicleta(placa, marca, modelo, precoPorHra, estilo) );
				return true;
			}
			return false;
	}

	public Automovel pesquisaAutomovelPelaPlaca(String numerosEletras){
		int i;
		Automovel auto;
	
		for( i = 0; i < this.auto.size(); i++){
			auto = (Automovel) this.auto.get(i);
			if(auto.getPlaca().getNumerosEletras().equals(numerosEletras)){
				//System.out.println(this.paciente.get(i));
				return auto;
			}
		}
		return null;
	}
	
	public Motocicleta pesquisaMotocicletaPelaPlaca(String numerosEletras){
		int i;
		Motocicleta moto;
	
		for( i = 0; i < this.auto.size(); i++){
			moto = (Motocicleta) this.moto.get(i);
			if(moto.getPlaca().getNumerosEletras().equals(numerosEletras)){
				//System.out.println(this.paciente.get(i));
				return moto;
			}
		}
		return null;
	}


	public boolean removeAutomovelPelaPlaca(String numerosEletras){
		int i;
		for( i = 0; i < this.auto.size(); i++){
			Automovel auto = (Automovel) this.auto.get(i);
			if(auto.getPlaca().getNumerosEletras().equals(numerosEletras)){
				this.auto.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeMotocicletaPelaPlaca(String numerosEletras){
		int i;
		for( i = 0; i < this.moto.size(); i++){
			Motocicleta moto = (Motocicleta) this.moto.get(i);
			if(moto.getPlaca().getNumerosEletras().equals(numerosEletras)){
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
