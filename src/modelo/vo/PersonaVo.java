package modelo.vo;

import java.util.ArrayList;
import java.util.List;

public class PersonaVo {
	private Long idPersona;
	private String nombre;
	private String telefono;
	private String profesion;
	private int tipo;

	private Nacimiento nacimiento;
	private List<MascotaVo> listaMascotas;
	
	public PersonaVo() {
		this.listaMascotas=new ArrayList<MascotaVo>();
	}
	
	public PersonaVo(Long idPersona, String nombre, String telefono, 
			String profesion, int tipo, Nacimiento nacimiento) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.telefono = telefono;
		this.profesion = profesion;
		this.tipo = tipo;
		this.nacimiento = nacimiento;
		this.listaMascotas=new ArrayList<MascotaVo>();
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Nacimiento getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(Nacimiento nacimiento) {
		this.nacimiento = nacimiento;
	}

	public List<MascotaVo> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(List<MascotaVo> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}
	
	@Override
	public String toString() {
		System.out.println("Ingresa");
		return "Persona [idPersona=" + idPersona + ","
				+ " nombre=" + nombre + ", telefono=" + telefono + 
				", profesion="+ profesion + ", tipo=" + tipo + ","
						+ " nacimiento=" + nacimiento + "]";
	}


}
