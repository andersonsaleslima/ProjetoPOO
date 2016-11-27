package exer3;


import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
	private Paciente paciente;
	private Medico medico;
	private LocalDate data;
	private LocalTime hora;
	
	
	
	
	
	
	
	
	/**
	 * @param paciente
	 * @param medico
	 * @param data
	 * @param hora
	 */
	public Consulta(Paciente paciente, Medico medico, LocalDate data, LocalTime hora) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Consulta [paciente=" + paciente + ", medico=" + medico + ", data=" + data + ", hora=" + hora.toString().substring(0, 8) + "]\n";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Consulta))
			return false;
		Consulta other = (Consulta) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		return true;
	}
	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}


	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}


	/**
	 * @return the data
	 */
	public LocalDate getData() {
		return data;
	}


	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}
	
	
	

}
