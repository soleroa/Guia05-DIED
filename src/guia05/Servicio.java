package guia05;

public abstract class Servicio {
	String nombre; 
	Trabajador trabajador;
	int monto; 
	Oficio oficio; 
	boolean esUrgente;
	
	public Servicio(String nombre, Trabajador trabajador, int  monto, Oficio oficio){
		this.nombre=nombre;
		this.trabajador=trabajador; 
		this.monto= monto;
		this.oficio=oficio; 
	}
	
	public double getMonto(){
		return monto; 
	}
	
}


