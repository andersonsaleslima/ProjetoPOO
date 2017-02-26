package controller;

import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;


public class ColecaoPessoa {
	private  List<Pessoa> func = new ArrayList<Pessoa>();
	private List<Pessoa> client =  new ArrayList<Pessoa>();
	
	public boolean adicionarFuncionario(String nome, Endereco endereco, String cpf, String login, String senha, LocalDate dataNascimento,
			String cargo, String matricula) {
			if(cpf != null){
			
				this.func.add(new Funcionario(nome,endereco,cpf, login, senha, dataNascimento, cargo, matricula) );
				return true;
			}
			return false;
	}


	public boolean adicionarCliente(String nome, Endereco endereco, String cpf, String login, String senha, LocalDate dataNascimento,
			String cnh, String categoriaCnh) {
			if(cpf != null){
			
				this.client.add(new Cliente(nome,endereco,cpf, login, senha, dataNascimento, cnh, categoriaCnh) );
				return true;
			}
			return false;
	}

	public Funcionario pesquisaClientePeloCPF(String cpf){
		int i;
		Funcionario func;
	
		for( i = 0; i < this.func.size(); i++){
			func = (Funcionario) this.func.get(i);
			if(func.getCpf().equals(cpf)){
				//System.out.println(this.paciente.get(i));
				return func;
			}
		}
		return null;
	}

	public Cliente pesquisaFuncioanrioPeloCPF(String cpf){
		int i;
		Cliente client;
	
		for( i = 0; i < this.client.size(); i++){
			client = (Cliente) this.client.get(i);
			if(client.getCpf().equals(cpf)){
				//System.out.println(this.paciente.get(i));
				return client;
			}
		}
		return null;
	}
	
	public boolean removeFuncioanrioPeloCPF(String cpf){
		int i;
		for( i = 0; i < this.func.size(); i++){
			Funcionario func = (Funcionario) this.func.get(i);
			if(func.getCpf().equals(cpf)){
				this.func.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeClientePeloCPF(String cpf){
		int i;
		for( i = 0; i < this.client.size(); i++){
			Cliente client = (Cliente) this.client.get(i);
			if(client.getCpf().equals(cpf)){
				this.client.remove(i);
				return true;
			}
		}
		return false;
	}

	public void listagemCliente(){
		Cliente client ;
		
		System.out.println();
		for(int i = 0; i< this.client.size(); i++){
			client = (Cliente) this.client.get(i);
			System.out.println(client);
		}
	}
	
	public void listagemFuncionario(){
		Funcionario func ;
		
		System.out.println();
		for(int i = 0; i< this.func.size(); i++){
			func = (Funcionario) this.func.get(i);
			System.out.println(func);
		}
	}
}