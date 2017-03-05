package controller;

import java.util.ArrayList;

public class Controller implements Icontroller{
	private ColecaoPessoa cp=new ColecaoPessoa();
	private	ColecaoLocacao cl=new ColecaoLocacao();
	private	ColecaoVeiculo cv=new ColecaoVeiculo();

	@Override
	public void addPessoa(Pessoa p) {

		cp.addPessoa(p);
	}

	@Override
	public ArrayList<Pessoa> listarPessoa() {

		return cp.listarPessoa();
	}

	@Override
	public ArrayList<Cliente> listarCliente() {

		return cp.listarClientes();

	}

	@Override
	public boolean removerPessoa(String cpf) {
		
		
		return cp.removerPessoa(cpf);
	}

}
