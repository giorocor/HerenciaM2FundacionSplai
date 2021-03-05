package Modelos;



public class Boss extends Empleados {

	final double IRPF=-0.32;
	final double AJUSTESUELDO=0.50;
	final static double SUELDOMIN=8000;
	final static double SUELDOMAX=999999999;

	
	public Boss(double sueldoMensual) {
		this.sueldoMensual= super.validarSueldo(sueldoMensual, SUELDOMAX, SUELDOMIN);
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
	}



}
