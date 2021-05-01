package guia05;

public class ServicioPersonalizado extends Servicio{
	private double costoMateriales, costoTransporte, costoPresupuestado; 
	public ServicioPersonalizado(double costoMateriales, double costoTransporte, double costoPresupuestado, String nombre, Trabajador trabajador, int monto, Oficio oficio){
		super(nombre, trabajador, monto, oficio);
		this.costoMateriales=costoMateriales; 
		this.costoTransporte= costoTransporte; 
		this.costoPresupuestado=costoPresupuestado; 
		
	}
	
	public double calcularCostoServicioPersonalizado(double costoMateriales, double costoTransporte, double costoPresupuestado) {
		double costoTotal;
		costoTotal= this.costoMateriales + this.costoTransporte + this.costoPresupuestado;
		return costoTotal;
	}
	
	//gettters
	public double getCostoMateriales() {
		return costoMateriales; 
	}
	public double getCostoTransporte() {
		return costoTransporte; 
	}
	public double getCostoPresupuestado() {
		return costoPresupuestado;
	}
	
	//setters
	public void setCostoMateriales(double costoMateriales) {
		this.costoMateriales=costoMateriales;
	}
	public void setCostoTransporte(double costoTransporte) {
		this.costoTransporte=costoTransporte;
	}
	public void setCostoPresupuestado(double costoPresupuestado) {
		this.costoPresupuestado=costoPresupuestado;
	}
}


