package controller;

import java.util.ArrayList;

public class ColecaoLocacao {

	private ArrayList<Locacao> locacoes;
	
	 public ColecaoLocacao() {
		 
		this.locacoes=new ArrayList<Locacao>();
	}
	 
	 public void addLocacao(Locacao locacao){
		 locacoes.add(locacao);
	 }
	 
	 @SuppressWarnings("static-access")
	public void remoceLocacao(int id){
		 
		 for (Locacao locacao : locacoes) {
			 if (locacao.getId()==id);
			 locacoes.remove(id);
			 
			
		}
		 
	 }
	 
	 
}
