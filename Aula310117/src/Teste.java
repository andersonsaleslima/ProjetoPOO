
public class Teste {

	public static void main(String[] args) {
	/*	String matricula="123";
		String cpf="059.089.254-11";
		String nome="Fabiano";
		*/
		
		Funcionario f=new Funcionario("123", "05908928711", "Fabiano", 5000);
		
		Medico medico=new Medico("123", "05908928711", "Fabiano", 5000, "0000","Oftalmo");
		
		System.out.println(medico.toString());
		
	
		

	}

}
