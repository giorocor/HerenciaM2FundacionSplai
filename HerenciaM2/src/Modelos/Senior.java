package Modelos;

public class Senior extends Empleados {

	final double IRPF=0.24;
	final double AJUSTESUELDO=-0.05;
	final static double SUELDOMIN=2700;
	final static double SUELDOMAX=4000;

	
	public Senior(double sueldoMensual) {
		this.sueldoMensual= super.validarSueldo(sueldoMensual, SUELDOMAX, SUELDOMIN);
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
	}

}
