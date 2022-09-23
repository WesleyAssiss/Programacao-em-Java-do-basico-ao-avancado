
package baskara;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import baskara.ResolvedorBaskara.BaskaraException;
import baskara.ResolvedorBaskara.ResultadoBaskara;


public class ResolvedorBaskaraTest {

	private ResolvedorBaskara resolvedor;
	
	@Before
	public void antes(){
		resolvedor = new ResolvedorBaskara();
	}

	@Test
	public void deveCalcularFormulaComDoisResultados() {
		ResultadoBaskara resultado = resolvedor.resolve(1, -2, -3);
		
		assertEquals(3.0, resultado.getX1(), 0.0001);
		assertEquals(-1.0, resultado.getX2(), 0.0001);
	}

	
	@Test
	public void deveCalcularFormulaComApenasUmResultado() {
		ResultadoBaskara resultado = resolvedor.resolve(1, 8, 16);
		
		assertTrue(resultado.getX1() == resultado.getX2());

		assertEquals(-4.0, resultado.getX1(), 0.0001);
		assertEquals(-4.0, resultado.getX2(), 0.0001);
	}

	@Test(expected=BaskaraException.class)
	public void deveLancarExcecaoComFormulaSemResultado() {
		resolvedor.resolve(10, 6, 10);
	}
 

}
