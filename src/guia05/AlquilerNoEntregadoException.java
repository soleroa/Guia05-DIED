package guia05;

public class AlquilerNoEntregadoException extends Exception {
	public AlquilerNoEntregadoException() {
		super("Este usuario tiene dos o mas alquileres sin devolver");
	}

}
