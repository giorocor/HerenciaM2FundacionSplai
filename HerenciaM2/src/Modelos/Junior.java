package Modelos;

public class Junior extends Empleados{

	final double IRPF=0.02;
	final double AJUSTESUELDO=-0.15;
	final static double SUELDOMIN=900;
	final static double SUELDOMAX=1600;

	
	public Junior(double sueldoMensual) {
		this.sueldoMensual= super.validarSueldo(sueldoMensual, SUELDOMAX, SUELDOMIN);
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
	}

}
