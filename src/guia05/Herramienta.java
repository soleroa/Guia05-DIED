package guia05;
public class Herramienta {
	private String nombre; 
	private double costo;
	private boolean fueDevuelta=false;
	
	public Herramienta (String nombre, double costo, boolean fueDevuelta) {
		this.nombre=nombre;
		this.costo=costo; 
		this.fueDevuelta=fueDevuelta;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public double getCosto(){
		return costo; 
	}
	public boolean getHerramientaDevuelta(){
		return fueDevuelta; 
	}
	
	//setters
	public void setNombre (String nombre) {
		this.nombre = nombre; 
	}
	public void setCosto(double costo) {
		this.costo = costo; 
	}
	public void setFuedevuelta (boolean fueDevuelta) {
		this.fueDevuelta = fueDevuelta; 
	}
}

