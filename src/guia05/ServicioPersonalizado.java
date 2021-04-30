package guia05;

public class ServicioPersonalizado extends Servicio{
	double costoMateriales, costoTransporte, costoPresupuestado; 
	public ServicioPersonalizado(double costoMateriales, double costoTransporte, String nombre, Trabajador trabajador, int monto, Oficio oficio){
		super(nombre, trabajador, monto, oficio);
		this.costoMateriales=costoMateriales; 
		this.costoTransporte= costoTransporte; 
		
	}
	
	public double calcularCostoServicioPersonalizado(double costoMateriales, double costoTransporte, double costoPresupuestado) {
		double costoTotal;
		costoTotal= this.costoMateriales + this.costoTransporte + this.costoPresupuestado;
		return costoTotal;
	}
}


