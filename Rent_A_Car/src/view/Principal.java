package view;

import controller.*;


public class Principal {

	private static Icontroller ic= new Controller();

	public static void main(String[] args) {

		Cliente      c=new Cliente();
		Cliente     c1=new Cliente();
		Funcionario  f=new Funcionario();


		c.setCnh("123");
		c.setNome("Fabiano");

		f.setCargo("gerente");
		f.setMatricula("321");


		c1.setCnh("111");
		c1.setNome("Fabiano");


		ic.addPessoa(f);
		ic.addPessoa(c);
		ic.addPessoa(c1);

		System.out.println(ic.listarPessoa().toString());
		
		for (Cliente cli : ic.listarCliente()) {
			
			if(cli.getCnh().equals("111")){
				System.out.println(cli.toString());
			}
			
		}
		
		
		/*
		
		ic.listarCliente("123");
		ic.listarCliente("111");
		ic.listarCliente("123");
*/
	}

}
