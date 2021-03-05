package Modelos;

public class Employee extends Empleados {

	final double IRPF=0;
	final double AJUSTESUELDO=-0.15;
	final static double SUELDOMIN=0;
	final static double SUELDOMAX=999999999;

	
	public Employee(double sueldoMensual) {
		this.sueldoMensual= super.validarSueldo(sueldoMensual, SUELDOMAX, SUELDOMIN);
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
	}
}
