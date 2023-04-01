import java.util.ArrayList;

public class GerenteProyecto extends Empleado {
	public ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();

	public GerenteProyecto (String nombre, int salario, String cargo) {
		super(nombre, salario, cargo);
	}
}