package guia05;
import java.util.ArrayList;

public class Trabajador {
	String nombre;
	Oficio oficio;
	String correoElectronico; 
	double porcentajePorComision;
	double costoPorHora; 
	private ArrayList<Trabajo> listaDeTrabajosAsignados = new ArrayList<Trabajo>();
	
	public Trabajador(String nombre, Oficio oficio, String correoElectronico, double porcentajePorComision, double costoPorHora) {
		this.nombre =nombre;
		this.oficio=oficio;
		this.correoElectronico= correoElectronico; 
		this.porcentajePorComision= porcentajePorComision;
		this.costoPorHora= costoPorHora; 
	}
	
	public void agregarTareas(ArrayList<Trabajo> listaDeTrabajosAsignados, Trabajo unTrabajo) throws OficioNoCoincideException, AgendaOcupadaException {
		if(this.oficio!=unTrabajo.trabajador.oficio) {
			throw new OficioNoCoincideException();
		}
		for(int i=0; i<listaDeTrabajosAsignados.size(); i++) {
			if((unTrabajo.fechaInicio)==(this.listaDeTrabajosAsignados.get(i).fechaInicio)) {
				throw new OficioNoCoincideException();
			}
		}
		listaDeTrabajosAsignados.add(unTrabajo);
	}
	
	//getters
	public String getNombre () {
		return nombre; 
	}
	public Oficio getOficioTrabajador() {
		return oficio;
	}
	public String getCorreo () {
		return correoElectronico;
	}
	public double getPorcentajePorComision() {
		return porcentajePorComision;
	}
	public double  getCostoPorHora () {
		return costoPorHora;
	}
	
	
	//settters
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	public void setOficioTrabajador (Oficio oficio) {
		this.oficio = oficio;
	}
	public void setCorreo (String correoElectronico) {
		this.correoElectronico = correoElectronico; 
	}
	public void setPorcentajePorComision (double porcentajePorComision) {
		this.porcentajePorComision = porcentajePorComision;
	}
	public void SetCostoPorHora(double costoPorHora) {
		this.costoPorHora = costoPorHora;
	}
	
}

