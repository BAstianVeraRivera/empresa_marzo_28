public class Proyecto {
	private String nombreProyecto;
	private String descripcion;

	public String getNombreProyecto() {
		return this.nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String toString() {
		return this.nombreProyecto + "\n" + this.descripcion;
	}

	public Proyecto(String nombreProyecto, String descripcion) {
		this.nombreProyecto = nombreProyecto;
		this.descripcion = descripcion;
	}
}