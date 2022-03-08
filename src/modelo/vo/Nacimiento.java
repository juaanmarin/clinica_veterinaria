package modelo.vo;

import java.time.LocalDate;

public class Nacimiento {
	private Long idNacimiento;
	private LocalDate fechaNacimiento;
	private String ciudadNacimiento;
	private String departamentoNacimiento;
	private String paisNacimiento;
	
	public Nacimiento() {
		
	}

	public Nacimiento(Long idNacimiento, LocalDate fechaNacimiento,
			String ciudadNacimiento,String departamentoNacimiento,
			String paisNacimiento) {
		super();
		this.idNacimiento = idNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.departamentoNacimiento = departamentoNacimiento;
		this.paisNacimiento = paisNacimiento;
	}

	public Long getIdNacimiento() {
		return idNacimiento;
	}

	public void setIdNacimiento(Long idNacimiento) {
		this.idNacimiento = idNacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public String getDepartamentoNacimiento() {
		return departamentoNacimiento;
	}

	public void setDepartamentoNacimiento(String departamentoNacimiento) {
		this.departamentoNacimiento = departamentoNacimiento;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	@Override
	public String toString() {
		
		String cad="\nNacimiento [idNacimiento=" + idNacimiento + ","
				+ " fechaNacimiento=" + fechaNacimiento
				+ ", ciudadNacimiento=" + ciudadNacimiento + ","
				+ "\n departamentoNacimiento=" + departamentoNacimiento
				+ ", paisNacimiento=" + paisNacimiento + "]";

		return cad;
	}

}
