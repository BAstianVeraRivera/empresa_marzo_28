public class Desarrollador extends Empleado {
	private String lenguajeProgra;

	public String getLenguajeProgra() {
		return this.lenguajeProgra;
	}

	public void setLenguajeProgra(String lenguajeProgra) {
		this.lenguajeProgra = lenguajeProgra;
	}

	public Desarrollador (String nombre, int salario, String cargo, String lenguajeProgra) {
		super(nombre, salario, cargo);
	}
}