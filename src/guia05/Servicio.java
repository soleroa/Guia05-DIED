package guia05;

public abstract class Servicio {
	private String nombre; 
	private Trabajador trabajador;
	private int monto; 
	private Oficio oficio; 
	private boolean esUrgente;
	
	public Servicio(String nombre, Trabajador trabajador, int  monto, Oficio oficio){
		this.nombre=nombre;
		this.trabajador=trabajador; 
		this.monto= monto;
		this.oficio=oficio; 
	}
	//getters
	public double getMonto(){
		return monto; 
	}
	public String getNombre() {
		return nombre; 
	}
	public Oficio getOficio() {
		return oficio;
	}
	public boolean esUrgente() {
		return esUrgente;
	}
	//setters
	public void setMonto(int monto) {
		this.monto=monto;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setOficio(Oficio oficio) {
		this.oficio=oficio;
	}
	public void setEsUrgente(boolean esUrgente) {
		this.esUrgente=esUrgente;
	}
	
}


