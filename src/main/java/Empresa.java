import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private String nombreEmpresa;
	private ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();
	public ArrayList<GerenteProyecto> gerentes = new ArrayList<GerenteProyecto>();
	public ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public static void main(String [] args) {
		inicializar();
	}
	public static void inicializar() {
		Empresa OAT = new Empresa();
		OAT.agregarEmpleado();
		OAT.agregarProyecto();
	}

	public void agregarEmpleado() {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado");
		String nombreEmpleado = intro.next();
		System.out.println("Ingrese salario del empleado");
		int salario = intro.nextInt();
		System.out.println("Ingrese cargo del empleado");
		String cargo = intro.next();
		Empleado empleado = new Empleado(nombreEmpleado, salario, cargo);
		this.empleados.add(empleado);
		System.out.println(empleado);
		System.out.println("Empleado agregado");
	}
	public void agregarProyecto() {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingrese nombre del proyecto");
		String nombreProyecto = intro.next();
		System.out.println("Ingrese descripción del proyecto");
		String descripcionProyecto = intro.next();
		Proyecto proyecto = new Proyecto(nombreProyecto, descripcionProyecto);
		this.proyectos.add(proyecto);
		System.out.println(proyecto);
		System.out.println("Proyecto agregado");
	}
	public void agregarEmpleadoAProyecto() {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado");
		String nombreEmpleado = intro.next();
		for(Empleado empleado : this.empleados){
			if(empleado.getNombre().equals(nombreEmpleado)){
				this.proyectos.add(empleado);
			}
		}
		System.out.println("Empleado agregado");
	}


}