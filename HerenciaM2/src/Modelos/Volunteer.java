package Modelos;

public class Volunteer extends Empleados {

	final double IRPF=0;
	final double AJUSTESUELDO=0;
	final static double SUELDOMIN=0;
	final static double SUELDOMAX=0;
	final double AYUDA=300;
	
	private double ayuda;

	
	public Volunteer() {
		this.sueldoMensual= 0;
		this.irpf=IRPF;
		this.ajusteSueldo=AJUSTESUELDO;
		this.setAyuda(AYUDA);
	}


	public double getAyuda() {
		return ayuda;
	}


	public void setAyuda(double ayuda) {
		this.ayuda = ayuda;
	}


	@Override
	public String toString() {
		return "Volunteer [ayuda=" + ayuda + ", sueldoMensual=" + sueldoMensual + ", irpf=" + irpf + ", ajusteSueldo="
				+ ajusteSueldo + "]";
	}
	
	

}
