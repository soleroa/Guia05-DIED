package guia05;

public class AgendaOcupadaException extends Exception {
	public AgendaOcupadaException() {
		super("El trabajador no se encuentra disponible en esta fecha");
	}
}
