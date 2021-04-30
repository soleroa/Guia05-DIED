package guia05;
import java.time.Period;
import java.time.LocalDate; 


public class Alquiler implements Contratable {
	Herramienta herramienta; 
	LocalDate fechaInicio;
	LocalDate fechaEntrega; 
	LocalDate fechaDevolucion; 
	
	public Alquiler(Herramienta herramienta, LocalDate fechaInicio, LocalDate fechaEntrega, LocalDate fechaDevolucion) {
		super();
		this.herramienta = herramienta; 
		this.fechaInicio= fechaInicio;
		this.fechaEntrega = fechaEntrega; 
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public double calcularCostoAlquiler(LocalDate fechaInicio, LocalDate fechaEntrega) {
		double dif;
		Period diferencia = Period.between(fechaInicio,fechaEntrega);
		dif=diferencia.getDays();
		double costoTotal=((this.herramienta.getCosto())*dif);
		return costoTotal;
	}
	public boolean enMora(LocalDate fechaEntrega, LocalDate fechaFinal) {
		if(this.fechaEntrega.isBefore(fechaDevolucion)){
			return true;
		}else {
			return false; 
		}
	}
	//ver esto
	public boolean Finalizado(){
		if(this.fechaDevolucion != null ) {
			return true;
		}else {
			return false;
		}
	}
	
	//getters 
	public Herramienta getHerramienta () {
		return herramienta;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega; 
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	
	//setters 
	
	public void setHerramienta (Herramienta herramienta ) {
		this.herramienta = herramienta; 
	}
	public void setFechaInicio (LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public void setFechaEntrega (LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega; 
	}
	public void setFechaDevolucion (LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
}