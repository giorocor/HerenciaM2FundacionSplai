package Modelos;

import javax.swing.JOptionPane;

public class MainAPP {

	private static String[] tipoEmpleados= {"Manager","Boss","Employee","Volunteer","Junior","Mid","Senior"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cuadro de dialogo para que indique el tipo de empleado a crear
		String tipoEmpleado=menuDesplegable(tipoEmpleados, "Selecciona el tipo de empleado");
		//Metodo Crear Empleado
		crearEmpleado(tipoEmpleado);
	}
	
	
	
	
	public static void crearEmpleado(String tipoEmpleado) {
		
		switch(tipoEmpleado){
			case "Manager":
				
				Manager manager =new Manager(solicitarSueldo() );
				System.out.println(manager);
				System.out.println(manager.cobrado());
				System.out.println(manager.sueldoNeto());
				break;
			case "Boss":
				Boss boss=new Boss(solicitarSueldo() );
				System.out.println(boss);
				System.out.println(boss.cobrado());
				System.out.println(boss.sueldoNeto());
				break;
			case "Employee":
				Employee employee =new Employee(solicitarSueldo() );
				System.out.println(employee);
				System.out.println(employee.cobrado());
				System.out.println(employee.sueldoNeto());
				break;
			case "Volunteer":
				Volunteer volunteer =new Volunteer();
				System.out.println(volunteer);
				System.out.println(volunteer.cobrado());
				System.out.println(volunteer.sueldoNeto());
				break;
			case "Junior":
				Junior junior =new Junior(solicitarSueldo() );
				System.out.println(junior);
				System.out.println(junior.cobrado());
				System.out.println(junior.sueldoNeto());
				break;
			case "Mid":
				Mid mid=new Mid(solicitarSueldo() );
				System.out.println(mid);
				System.out.println(mid.cobrado());
				System.out.println(mid.sueldoNeto());
				break;
			case "Senior":
				Senior senior =new Senior(solicitarSueldo() );
				System.out.println(senior);
				System.out.println(senior.cobrado());
				System.out.println(senior.sueldoNeto());
				break;
		}
	}
	
	
	//@giorocor para crear menu de eleccion
	private static String menuDesplegable(String[] opciones, String texto) {
		Object opcion = JOptionPane.showInputDialog(null, texto, "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones,
				opciones[0]);
		return (String) opcion;
	}

	//Crea Menu para ingresar un valor indicado
	private static double solicitarSueldo() {
		String sueldo = JOptionPane.showInputDialog("Ingresa el sueldo correspondiente al empleado");
		return Double.parseDouble(sueldo);
	}
}
