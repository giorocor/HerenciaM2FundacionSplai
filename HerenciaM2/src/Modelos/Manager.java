package Modelos;


public class Manager extends Empleados {

	
	final double IRPF=-0.26;
	final double AJUSTESUELDO=0.10;
	final static double SUELDOMIN=3000;
	final static double SUELDOMAX=5000;

	
	public Manager(double sueldoMensual) {
		this.sueldoMensual= super.validarSueldo(sueldoMensual, SUELDOMAX, SUELDOMIN);
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
	}


	@Override
	public String toString() {
		return "Manager [ sueldoMensual=" + sueldoMensual
				+ ", irpf=" + irpf + ", ajusteSueldo=" + ajusteSueldo + "]";
	}



	

}
