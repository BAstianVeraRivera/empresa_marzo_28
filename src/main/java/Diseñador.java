public class Diseñador extends Empleado {
	private String herramientasDiseño;

	public String getHerramientasDiseño() {
		return this.herramientasDiseño;
	}

	public void setHerramientasDiseño(String herramientasDiseño) {
		this.herramientasDiseño = herramientasDiseño;
	}

	public Diseñador (String nombre, int salario, String cargo, String herramientasDiseño) {
		super(nombre, salario, cargo);
	}
}