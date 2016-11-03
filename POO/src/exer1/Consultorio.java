package exer1;

/**
 * @author Fabiano S. Ferreira
 * 
 */
import java.util.Scanner;
/**
 * 
 * 
 */
public class Consultorio {
	
	static final int CONST = 100;
	private static  String[] nome = new String[CONST];
	private static  String[] sexo = new String[CONST];
	private static int idade[] = new int[CONST];
	private static double valorConsulta[]  =new double[CONST];
	private static int qnt=0;
	static Scanner sc=new Scanner(System.in);
	private static double soma;
	static double max = Double.MIN_VALUE;
/**
 * 
 * @param args
 */
	public static void main(String[] args) {

/**
 * Chamada do método que inicializa as strings
 */
		inicializaString();
		int op = -1;
		while(op!=0){

			menu();
			op=lerInt(sc);

			switch (op) {
			case 1:

				cadastraConsulta();

				break;
			case 2:
				menu2();
				op=lerInt(sc);
				switch (op) {
				case 1:
					mostraRelatorio();
					break;
				case 2:
					mostraMedia();
					break;
				case 3:
					mostraInfMasc();
					break;
				case 4:
					maiorValor();
					break;

				default:
					break;
				}
				break;
			case 0:
				System.out.println("Você saiu do Sistema...");
				op=0;
				break;

			default :
				System.err.println("Opção Inválida Digite 1, 2 ou 0");
				break;
			}


		}

	}


/**
 * 
 * @param sc recebido como parametro
 * @return retornas apenas  se for um int
 */
	public static int lerInt(Scanner sc){
		int r=0;
		do{
			while(!sc.hasNextInt()){
				sc.nextLine();
				System.out.println("Tipo de dado inválido. Digite um inteiro: ");
			}
			r = sc.nextInt();
			sc.nextLine();

		}while(r<0);

		return r;
	}

	/**
	 * 
	 * @param sc recebido como parametro
 * @return retornas apenas  se for um double
	 */
	public static double lerDouble(Scanner sc){
		double r=0;

		while(!sc.hasNextDouble()){
			sc.nextLine();
			System.out.print("Tipo de dado inválido. ");
		}
		r = sc.nextDouble();
		sc.nextLine();

		return r;

	}
	
	/**
	 * método que recebe os dados referentes as nome,sexo,idade e valor 
	 * e logo após isso passa os dados para cada indice dos array
	 * e sempre pegunta se vai ser inserido um novo conjunto de dados
	 * 
	 */

	public static void cadastraConsulta(){

		for (int i = 0; i < CONST; i++) {
			
			System.out.println("\nDigite o Nome do "+(i+1)+"º Cliente");
			String nome1=sc.nextLine();
			System.out.println("\nDigite o Sexo do "+(i+1)+"º Cliente");
			String sexo1=lerSexo(sc);
			System.out.println("\nDigite a idade do "+(i+1)+"º Cliente");
			int idade1=lerInt(sc);
			System.out.println("\nDigite o Valor da Consulta do "+(i+1)+"º Cliente");
			double valorConsulta1=lerDouble(sc);

						
			nome[i]=nome1;
			sexo[i]=sexo1;
			idade[i]=idade1;
			valorConsulta[i]=valorConsulta1;
			qnt++;
			
			
			System.out.println("\nDeseja Continuar? [s/n]");
			String temp=sc.nextLine();
			if (temp.equalsIgnoreCase("n")){
				break;
			}

		}


	}
	
	/**
	 * Mostra as informações contida em cada array
	 * 
	 */

	public static void mostraRelatorio(){

		for(int i=0; i< CONST;i++){

			if(nome[i].equals("")){
				break;

			}else{
				System.out.println("Todos os Dados armazenados:\n"
						+ "\nNome: "+nome[i]
								+"\nSexo: "+sexo[i]
										+"\nIdade: "+idade[i]
												+"\nValor Da Consulta: "+valorConsulta[i]);
			}

		}


	}
	/**
	 * Faz uma pesquisa em e cada valor de consulta, soma os valores
	 * e vai armazenando na variável soma e depois divide pela quantidade que foi
	 * inserida. Com isso depois mostra a média.
	 * 
	 */
	public static void mostraMedia (){

		soma = 0.0;

		for(int i=0; i< CONST;i++){
			soma+=valorConsulta[i];

		}
		System.out.println("Valor Medio das Consulta: "+soma/qnt);

	}

	/**
	 * Faz uma comparação de sexo, se o for masculino será mostrado as informações
	 * referente aquele resultado encontrado.
	 * 
	 */
	public static void mostraInfMasc(){

		for(int i=0; i< CONST;i++){
			if(sexo[i].equalsIgnoreCase("Masculino")){
				System.out.println("Dados das pessoas do sexo masculino:\n "
						+ "\nNome: "+nome[i]
								+"\nSexo: "+sexo[i]
										+"\nIdade: "+idade[i]
												+"\nValor Da Consulta: "+valorConsulta[i]);

			}	 
		}

	}
/**
 * Compara se é do sexo feminino e vai verificando qual é o maior
 * valor de cada consulta. Depois uma nova pesquisa já sabendo
 * qual tem o maior salário e mostra as informações da mesma
 * 
 */
	public static void maiorValor(){

		for(int i=0; i< CONST;i++){
			if(sexo[i].equalsIgnoreCase("Feminino")){
				if(valorConsulta[i]>max){
					max=valorConsulta[i];
				}
				
			}
		}
		for(int i=0; i< CONST;i++){
			if(valorConsulta[i]==max){
				System.out.println("Maior valor de consulta realizado por uma pessoa do sexo feminino:\n "
						+ "\nNome: "+nome[i]
								+"\nSexo: "+sexo[i]
										+"\nIdade: "+idade[i]
												+"\nValor Da Consulta: "+valorConsulta[i]);
			}
		}


	}
	/**
	 * Para evitar excessão nullpointexception
	 * será inicializado todas as strings 
	 * 
	 */
	public static void inicializaString(){
		for(int i=0; i<CONST;i++){
			nome[i]="";
			sexo[i]="";
		}

	}
/**
 * Primeiro menu 
 * 
 */
	public static void menu(){
		System.out.println(" ____________________________");
		System.out.println("|                            |");
		System.out.println("|   DIGITE UMA DAS OPÇÕES:   |");
		System.out.println("|                            |"
				+ "\n|   1- Cadastar Consulta     |"
				+ "\n|                            |"
				+ "\n|   2- Listar Informações    |"
				+ "\n|                            |"
				+ "\n|   0- Sair                  |");
		System.out.println("|____________________________|");


	}
	
	/**
	 * Segundo menu, com mais opções.
	 * 
	 */
	public static void menu2(){
		System.out.println(" __________________________________________________________________________"
				+"\n|                                                                          |"
				+"\n|                       DIGITE UMA DAS OPÇÕES                              |"
				+"\n|                                                                          |"
				+"\n| 1 - Imprimir na tela os dados armazenados:                               |"
				+"\n|                                                                          |"
				+"\n| 2 - Imprimir a média do valor das consultas realizadas:                  |"
				+"\n|                                                                          |"
				+"\n| 3 - Imprimir os dados das pessoas do sexo masculino:                     |"
				+"\n|                                                                          |"
				+"\n| 4 - Imprimir o maior valor de consulta realizado por uma pessoa do sexo: |"
				+"\n|__________________________________________________________________________|");


	}
	/**
	 * 
	 * 
	 * @param in
	 * @return garante que será retornado apenas uma string que seja 
	 * feminino ou masculino
	 */
	public static String lerSexo(Scanner in){
        String sexo=in.nextLine();
    
         while(!((sexo.equalsIgnoreCase("Feminino"))||(sexo.equalsIgnoreCase("Masculino")))){
			
			System.out.println("Digite Masculino ou Feminino! ");
			sexo=in.nextLine();
		}
        return sexo;
        
        
    }
	   
	
	


}
