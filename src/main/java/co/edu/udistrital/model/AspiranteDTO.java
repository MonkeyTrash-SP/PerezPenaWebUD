package co.edu.udistrital.model;

import java.io.Serializable;
import java.util.Objects;

public class AspiranteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String numeroIde;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String correo;
	private ProgAcad pro_acad;
 

	public AspiranteDTO() {
	
		pro_acad = new ProgAcad();
	}

	public AspiranteDTO(String numeroIde, String nombre, String apellidos, String telefono, 
			String correo, ProgAcad pro_acad) {

		this.numeroIde = numeroIde;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.pro_acad = pro_acad;
	}

	public String getNumeroIde() {
		return numeroIde;
	}

	public void setNumeroIde(String numeroIde) {
		this.numeroIde = numeroIde;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ProgAcad getPro_acad() {
		return pro_acad;
	}

	public void setPro_acad(ProgAcad pro_acad) {
		this.pro_acad = pro_acad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, correo, nombre, numeroIde, pro_acad, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AspiranteDTO other = (AspiranteDTO) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(correo, other.correo)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(numeroIde, other.numeroIde)
				&& Objects.equals(pro_acad, other.pro_acad) && Objects.equals(telefono, other.telefono);
	}

	

}
