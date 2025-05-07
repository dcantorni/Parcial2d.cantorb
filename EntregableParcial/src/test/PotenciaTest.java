package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logica.Parcial;

class PotenciaTest {
	@Test
	public void potenciaTest() throws Exception {
		assertEquals(9, Parcial.potencia(3,2));
		Exception e = assertThrows(Exception.class, () -> Parcial.potencia(300, 200));
		assertEquals("Numero mayor a un entero", e.getMessage());
		Exception e1 = assertThrows(Exception.class, () -> Parcial.potencia(0, 0));
		assertEquals("0^0 no esta definido", e1.getMessage());
		
	}
}
