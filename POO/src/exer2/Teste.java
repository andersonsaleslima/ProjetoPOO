package exer2;

import java.math.BigInteger;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	BigInteger n;
		Scanner sc=new Scanner(System.in);

		Calculadora cal=new Calculadora();
		int op = 0;
		do { 

			menu();
			
			switch (lerInt(sc)) {
			case 1:
				cal.soma(lerBigInteger(sc));

				break;

			case 2:	
				cal.subtracao(lerBigInteger(sc));
				break;
			case 3:
				cal.multiplicacao(lerBigInteger(sc));

				break;
			case 4:
				cal.divisao(lerBigIntegerPos(sc));
				break;
			case 5:
				cal.potencia(lerInt(sc));
				break;
			case 6:
				op=6;
				break;

			default:
				System.err.println("Digite uma opção valida");
				break;
			}


			System.out.println(cal.toString());

		} while (op != 6);

		System.out.println("Saiu");
	}

	public static BigInteger lerBigInteger(Scanner sc){
		BigInteger n;
		System.out.println("Digite um numero");
		while(!sc.hasNextBigInteger()){
			System.out.println("Tipo de dado inválido. ");
		}
		n = sc.nextBigInteger();
		return n;

	}
	public static BigInteger lerBigIntegerPos(Scanner sc){
		BigInteger n;
		System.out.println("Digite um numero");
		while(!sc.hasNextBigInteger()){
			System.out.println("Tipo de dado inválido. ");
		}
		n = sc.nextBigInteger();

		if (n.equals(BigInteger.ZERO)){
			System.out.println("\nDivisão por O, Digite um valor positvo\n");
			return lerBigInteger(sc);
		}

		return n;

	}

	public static int lerInt(Scanner sc){
		int r=0;
		System.out.println("Digite um Numero");

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


	public static void menu(){

		System.out.println(" ____________________________"
				+"_____________________________"
				+"\n|                                                         |"
				+"\n|                      CALCULADORA                        |"
				+"\n|____________________________"
				+" ____________________________|"

							+"\n|       1- Somar             "
							+"|       2- Subtrair          |"
							+"\n|----------------------------|"
							+"----------------------------|"
							+"\n|       3- Multiplicar       |"

							+"       4- Dividir           |"
							+"\n|----------------------------|"
							+"----------------------------|"
							+"\n|       5- Potencia          |"
							+ "                            |"
							+"\n|----------------------------|"
							+"       6- Sair              |"
							+"\n|____________________________|"
							+"____________________________|\n");



	}

}
