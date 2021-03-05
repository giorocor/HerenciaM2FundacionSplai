package Modelos;

import javax.swing.JOptionPane;

public class Empleados {
	protected double sueldoMensual;
	protected double irpf;
	protected double ajusteSueldo;
	
	
	public Empleados() {
		super();
		this.sueldoMensual = 0;
		this.irpf = 0;
		this.ajusteSueldo = 0;
	}
	


	public String cobrado() {
		return "El sueldo bruto Mensual es de "+(sueldoMensual*(1+ajusteSueldo)+" "
				+ "El sueldo bruto Anual es de "+(sueldoMensual*(1+ajusteSueldo)*14));
	}
	
	public double cobrado$() {
		return sueldoMensual*(1+ajusteSueldo);
	}
	
	public String sueldoNeto() {
		return "El sueldo Neto es de "+(cobrado$()*(1+irpf)+" "
				+ "El sueldo Neto anual es de "+(cobrado$()*(1+irpf)*14));
	}
	

	public double validarSueldo(double sueldoMensual,double max, double min) {
		while(!(sueldoMensual>=min && sueldoMensual<=max)) {
			sueldoMensual=solicitarCorrecionSueldo(max,min);
		}
		return sueldoMensual;
	}
	
	public double solicitarCorrecionSueldo(double max, double min) {
		String correcionSueldo=JOptionPane.showInputDialog(null, "El valor del sueldo mensual debe estar entre "+min+" y "+max);
		return Double.parseDouble(correcionSueldo);
	}
	

	
	
	

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}



	@Override
	public String toString() {
		return "Empleados [sueldoMensual=" + sueldoMensual + ", irpf=" + irpf + ", ajusteSueldo=" + ajusteSueldo + "]";
	}
	

	
	


	

	



	
	
	
}
