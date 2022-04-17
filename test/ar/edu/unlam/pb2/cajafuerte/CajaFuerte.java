package ar.edu.unlam.pb2.cajafuerte;

public class CajaFuerte {
	
	private Boolean estaAbierta = true;

	public Boolean laCajaEstaAbierta() {
		// TODO Auto-generated method stub
		
		return estaAbierta;
	}

	public void cerrar() {
		// TODO Auto-generated method stub
		estaAbierta = false;
	}

	public void abrir() {
		// TODO Auto-generated method stub
		estaAbierta = true;
	}

}
