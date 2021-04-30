package guia05;

public class ServicioEstandar extends Servicio{
	 double costoFijo;
	 Trabajador trabajador; 

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
	

	
}

