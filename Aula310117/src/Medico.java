
public class Medico extends Funcionario{
	private String crm;
	private String especialidade;

	public Medico(String matricula, String cpf,String nome, double salario, String crm, String especialidade ){

		super(matricula, cpf, nome, salario);

		this.crm=crm;
		this.especialidade=especialidade;


	}

	public String getCrm() {
		return this.crm;

	}

	public String toString(){


		return super.toString()+"\nCRM: "+this.crm+"\nEspecialidade:"+this.especialidade;
	}
	
	public double getSalario(){
		
		return 4*super.getSalario();
	}

}
