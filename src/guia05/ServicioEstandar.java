package guia05;

public class ServicioEstandar extends Servicio{
	 private double costoFijo;
	 private Trabajador trabajador; 

	public ServicioEstandar(double costoFijo, Trabajador trabajador,String nombre, int  monto, Oficio oficio) {
		super(nombre, trabajador, monto, oficio);
		this.costoFijo=costoFijo;
		this.trabajador = trabajador; 
	}
	public double calcularCostoServicioEstandar(double costoFijo, int montoPlus) {
		double costoFinal;
		costoFinal = (costoFijo + trabajador.getPorcentajePorComision());
		return costoFinal;
	}
	
	//getters 
	public double getCostoFijo(){
		return costoFijo;
	}
	public Trabajador getTrabajador() {
		return trabajador;
	}
	
	//setters 
	public void setCostoFijo(double costoFijo) {
		this.costoFijo=costoFijo;
	}
	public void setTrabajador (Trabajador trabajador ) {
		this.trabajador=trabajador; 
	}
	
	
}

