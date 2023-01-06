
public class Persona {
	
	private String nombre;
	private String domicilio;
	private String telefono;
	private String correo;
	private String fecha_nacimiento;
	private String genero;
		
	
	public Persona(String nombre, String domicilio, String telefono, String correo, String fecha_nacimiento,
			String genero) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.correo = correo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.genero = genero;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
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


	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", correo="
				+ correo + ", fecha_nacimiento=" + fecha_nacimiento + ", genero=" + genero + "]";
	}

	
	
	
	
}
