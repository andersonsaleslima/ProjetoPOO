package exer3;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
	static Scanner sc=new Scanner(System.in);

	static Consulta cons;
	static Paciente paciente;
	static Endereco end;
	static Medico   med;
	static ColecaoPacientes lisPaciente  = new ColecaoPacientes();
	static ColecaoMedicos   lisMedicos   = new ColecaoMedicos();
	static ColecaoConsultas lisConsultas = new ColecaoConsultas();

	public static void main(String[] args) {





		int op = 0;
		do { 

			menu();

			switch (lerInt(sc)) {
			case 1:
				cadastraConsulta();

				break;

			case 2:	
				menu2();

				switch (lerInt(sc)) {
				case 1:
					lisConsultas.listaConsultasPorPaciente();
					break;
				case 2:
					lisConsultas.listagemConsultas();
					break;
				case 3:
			
					lisConsultas.qtdConsultasPorMedico();

					break;
				case 4:
					lisPaciente.listagemDePacientesMaioresDe60anos();
					break;
				case 5:
					System.out.println("Digite o Documento do paciente");
					lisPaciente.pesquisaPeloDocumento(lerString(sc));
					
					break;
					
				case 6:
					System.out.println("Digite o Documento do paciente");
					lisPaciente.removePeloDocumento(lerString(sc));
					
					break;
					
				case 7:
					lisPaciente.qtdPacientesPorSexo();
					break;
					
				case 8:
					lisPaciente.listagemPacientesComEndereco();
					break;
					
				case 9:
					System.out.println("Digite parte do nome do m�dico");
					lisMedicos.pesquisaMedicoPorParteDoNome(lerString(sc));
					break;
					
				case 10:
					System.out.println("Ditgite o CRM do m�dico");
					lisMedicos.pesquisaPeloCRM(lerString(sc));
					break;

				case 11:
					System.out.println("Digite a data");
					lisConsultas.qtdConsultasData(getData());
					break;
				}

				break;


			default:
				System.err.println("Digite uma Op��o valida");
				break;
			}



		} while (op !=12);

		System.out.println("Saiu");
	}



	public static void menu(){
		 System.out.println(" ____________________________");
	     System.out.println("|                            |");
		 System.out.println("|   DIGITE UMA DAS OP��ES :  |");
		 System.out.println("|                            |"
						+ "\n|   1- Cadastar Consulta     |"
						+ "\n|                            |"
						+ "\n|   2- Listar Informa��es    |"
						+ "\n|                            |"
						+ "\n|   0- Sair                  |");
		 System.out.println("|____________________________|");


	}
	public static void menu2(){
		System.out.println("____________________________"
				+"_______________________________________________________________");
		System.out.println("|                                                                                          |");
		System.out.println("|                                   DIGITE UMA DAS OP��ES:                                 |");
		System.out.println("|__________________________________________________________________________________________|"
						+ "\n|   1- Listar de Consultas Por Parciente    "
						+ "| 2-Listar de Consultas                        |"
						+ "\n|                                           |"
						+ "\n|   3- Quantidade de Consultas Por Medico "
						+ "  | 4-Listagem de pacientes maiores de 60 anos   |"
						+ "\n|                                           |"
						+ "\n|   5- Listar paciente pelo documento       |"
						+ " 6-Remover pelo documento                     |"
						+ "\n|                                           |"
						+ "\n|   7- Quantidade de pacientes por sexo     |"
						+ " 8- Listar pacientes com endere�o             |"
						+ "\n|                                           |"
						+ "\n|   9- Pesquisar m�dico por parte do nome   |" 
						+ " 10- Listar M�dico pelo CRM                   |"
						+ "\n|   0- Sair                                 |"
						+ "                                              |"
						+"\n|___________________________________________|"
						+"______________________________________________|");
					

	//.out.println("|____________________________|");


	}

	public static String lerString(Scanner in){
		System.out.print("Digite novamente (m�nimo de 3 caracteres): ");
		String r;
		do{
			r = in.nextLine();
			if(r.length()<3){
				System.out.print("O nome deve ter, no m�nimo, 3 caracteres. Digite novamente: ");
			}
		}while(r.length()<3);
		return r;

	}

	public static int lerInt(Scanner sc){
		int r=0;
		System.out.println("Digite um Numero");

		do{
			while(!sc.hasNextInt()){
				sc.nextLine();
				System.out.println("Tipo de dado inv�lido. Digite um inteiro: ");
			}
			r = sc.nextInt();
			sc.nextLine();

		}while(r<0);

		return r;
	}

	public static String lerData(Scanner in){
		System.out.print("Digite no formato (dd/mm/aaaa) ");
		String r;
		do{
			r = in.nextLine();
			if(r.length()!=10){
				System.out.print("Formato inv�lido digite: dd/mm/aaaa");
			}
		}while(r.length()!=10);
		return r;

	}

	public static void cadastraConsulta(){

		paciente=new Paciente();

		System.out.println("Digite Nome: ");
		paciente.setNome(lerString(sc));

		System.out.println("Digite Sexo: ");
		paciente.setSexo(lerString(sc));

		System.out.println("Digite Documento: ");
		paciente.setDocumento(lerString(sc));

		System.out.println("Digite Data Nascimeto : ");


		
		paciente.setData(getData());

		end=new Endereco();

		System.out.println("Digite Bairro: ");
		end.setBairro(lerString(sc));

		System.out.println("Digite Rua: ");
		end.setRua(lerString(sc));

		System.out.println("Digite CEP: ");
		end.setCEP(lerString(sc));

		System.out.println("Digite Complemento: ");
		end.setComplemento(lerString(sc));


		med=new Medico();		

		System.out.println("Digite Nome do medico: ");
		med.setNome(lerString(sc));

		System.out.println("Digite Crm do medico: ");
		med.setCrm(lerString(sc));

		System.out.println("Digite Especialidade do medico: ");
		med.setEspecialidade(lerString(sc));


		paciente.setEndereco(end);

		cons=new Consulta();
		cons.setPaciente(paciente);
		cons.setMedico(med);
		cons.setData(LocalDate.now());
		cons.setHora(LocalTime.now());

		lisMedicos.adicionaMedico(med);
		lisPaciente.adicionarPaciente(paciente);
		lisConsultas.adicionaConsulta(cons);

	
	}
	
	static LocalDate getData(){
	
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate sData = LocalDate.parse( lerData(sc) , fmt2 );	
		return sData;
	}

}

