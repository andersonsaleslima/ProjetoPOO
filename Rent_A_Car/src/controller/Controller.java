package controller;

import java.util.ArrayList;

public class Controller implements Icontroller{
	private ColecaoPessoa cp=new ColecaoPessoa();
	private	ColecaoLocacao cl;
	private	ColecaoVeiculo cv;

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

}
