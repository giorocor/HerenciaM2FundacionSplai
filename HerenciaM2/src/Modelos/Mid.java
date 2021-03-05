package Modelos;

public class Mid extends Empleados {

	final double IRPF=0.15;
	final double AJUSTESUELDO=-0.10;
	final static double SUELDOMIN=1800;
	final static double SUELDOMAX=2500;

	
	public Mid(double sueldoMensual) {
		this.sueldoMensual= super.validarSueldo(sueldoMensual, SUELDOMAX, SUELDOMIN);
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
	}

}
