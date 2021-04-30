package guia05;
import java.time.LocalDate;
public class Trabajo implements Contratable {
	Trabajador trabajador; 
	Servicio servicio;
	LocalDate fechaInicio;
	LocalDate fechaFin; 
	boolean esUrgente;
	
	public Trabajo (Trabajador trabajador, Servicio servicio, LocalDate fechaInicio, LocalDate fechaFin, boolean esUrgente) {
		this.trabajador=trabajador; 
		this.servicio=servicio; 
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin; 
		this.esUrgente=esUrgente;
	}
	
	
	public boolean Finalizado(){
		if(this.fechaFin == null) {
			return false; 
		}else {
			return true;
		}
	}
	//getters
	public Trabajador getTrabajador() {
		return trabajador; 
	}
	public Servicio getServicio() {
		return servicio;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public boolean getEsUrgente() {
		return esUrgente;
	}
	//setters 
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador=trabajador;
	}
	public void setServicio (Servicio servicio) {
		this.servicio=servicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio=fechaInicio;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public void setEsUrgente(boolean esUrgente) {
		this.esUrgente = esUrgente;
	}
	
	}
