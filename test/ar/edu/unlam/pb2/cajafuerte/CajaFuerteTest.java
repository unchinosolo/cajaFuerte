package ar.edu.unlam.pb2.cajafuerte;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {

	private Integer codigoDeApertura;

	@Test
	public void AlCrearUnaCajaFuerteDeberiaEstarAbierta() {

		CajaFuerte caja = cuandoCreoUnaCajaFuerte();
		CajaFuerteAbierta(caja);
		laCajaEstaAbierta();

	}

	@Test
	public void alCerrarlaDeberiaQuedarCerrada() {
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
		cuandoCierroLaCajaFuerte(caja);
		entoncesLaCajaFuerteEstaCerrada();
	}
	
	@Test
	public void alAbrirLaCajaFuerteConElCodigoDeCierreDeberiaAbrirse() {
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
		dadoQueCierroLaCajaFuerte(caja, codigoDeApertura);
		CuandoAbroLaCajaFuerte(caja, codigoDeApertura);
		entoncesLaCajaFuerteEstaAbierta(caja);
	}
	
	
	private void entoncesLaCajaFuerteEstaAbierta(CajaFuerte caja) {
		// TODO Auto-generated method stub
		caja.abrir();
		
	}

	private void CuandoAbroLaCajaFuerte(CajaFuerte caja, Integer codigoDeApertura) {
		// TODO Auto-generated method stub
		
	}

	private void dadoQueCierroLaCajaFuerte(CajaFuerte caja, Integer codigoDeApertura) {
		// TODO Auto-generated method stub
		
	}

	private void entoncesLaCajaFuerteEstaCerrada() {
		// TODO Auto-generated method stub

	}

	private void cuandoCierroLaCajaFuerte(CajaFuerte caja) {
		// TODO Auto-generated method stub
		caja.cerrar();

	}

	private CajaFuerte dadoQueExisteUnaCajaFuerte() {
		// TODO Auto-generated method stub
		return new CajaFuerte();
	}

	private void laCajaEstaAbierta() {
		// TODO Auto-generated method stub

	}

	private void CajaFuerteAbierta(CajaFuerte caja) {
		// TODO Auto-generated method stub

		Assert.assertTrue(caja.laCajaEstaAbierta());
	}

	private CajaFuerte cuandoCreoUnaCajaFuerte() {
		// TODO Auto-generated method stub
		return new CajaFuerte();
	}

}
