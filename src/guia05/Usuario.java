package guia05;
import java.util.ArrayList;
public class Usuario {
	String nombre; 
	String mail;
	private ArrayList<Contratable> listaDeContratables = new ArrayList<Contratable>();


	public Usuario(String nombre,String mail, ArrayList<Contratable> listaDeContratables ) {
		this.nombre= nombre; 
		this.mail=mail;
		this.listaDeContratables = listaDeContratables;
	} 
	
	// metodo contratar 
	public void Contratar(Contratable contratable) throws AlquilerNoEntregadoException {
		int contador=0;
		for(int i=0; i< listaDeContratables.size();i++) {
			if(listaDeContratables.get(i).Finalizado()==false) {
				contador++;
				if(contador>2) {
					throw new AlquilerNoEntregadoException();
				}
			}
		}
		listaDeContratables.add(contratable);
	}
	
	//getters 
	public String getNombre() {
		return nombre;
	}
	public String getMail() {
		return mail; 
	}
	public ArrayList<Contratable> getListaDeContratables(){
		return listaDeContratables;
	}
	
	//setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setListaDeContratables(ArrayList <Contratable> listaDeContratables) {
		this.listaDeContratables= listaDeContratables; 
	}
}
