package controller;

import java.util.ArrayList;

public interface Icontroller {
	
	public void addPessoa(Pessoa p);
	public ArrayList<Pessoa> listarPessoa();
	public ArrayList<Cliente> listarCliente();
	public boolean removerPessoa(String cpf);

}
