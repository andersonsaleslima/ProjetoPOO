package exer2;

import java.math.BigInteger;

public class Calculadora {
	

	private BigInteger numero;

	public Calculadora() {
		
	this.numero=BigInteger.ZERO;
	}
	
	
	
	public void soma(BigInteger numero){
		this.numero=numero.add(numero);
		
	}
	
	public void subtracao(BigInteger numero){
		this.numero=this.numero.subtract(numero);
		
	}
	
	public void multiplicacao(BigInteger numero){
		this.numero=this.numero.multiply(numero);
		
	}
	
	public void divisao(BigInteger numero){
		
		this.numero=this.numero.divide(numero);
		
	}
	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

*/

	public void potencia(int numero){
		this.numero=this.numero.pow(numero);
		
	}
	
	/*public boolean equals(BigInteger numero){
		
		if(this.numero.equals(numero)){
			return true;
		}else
			
		return false;
	}
	*/
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Calculadora)) {
			return false;
		}
		Calculadora other = (Calculadora) obj;
		if (numero == null) {
			if (other.numero != null) {
				return false;
			}
		} else if (!numero.equals(other.numero)) {
			return false;
		}
		return true;
	}



	public String toString() {
		return "Calculadora [Resultado =" + numero + "]";
	}


}
