package br.com.babystepgame.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JogoDaVelhaTest {	
	private JogoDaVelha jogoDaVelha;
	
	@Before
	public void setUp() {
		jogoDaVelha = new JogoDaVelha();
	}
	
	@Test
	public void testDeveInserirBolaNaPosicao00() {
		jogoDaVelha.inserirBola(0, 0);		
		assertEquals(1, jogoDaVelha.velha[0][0]);				
	}

	@Test
	public void testDeveInserirXisNaPosicao00() {
		jogoDaVelha.inserirXis(0, 0);		
		assertEquals(2, jogoDaVelha.velha[0][0]);				
	}	
	
	@Test
	public void testDeveInserirXisForaDaMatrizI() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(4, 0);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirXisNaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 4);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirXisDentroDaMatrizI() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(2, 0);		
		assertTrue(retornoDoInserirXis);					
	}

	@Test
	public void testDeveInserirXisDentroDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 2);		
		assertTrue(retornoDoInserirXis);					
	}
	
	@Test
	public void testDeveInserirBolaForaDaMatrizI() {
		boolean retornoDoInserirXis = jogoDaVelha.inserirBola(4, 0);		
		assertFalse(retornoDoInserirXis);					
	}
	
	@Test
	public void testDeveInserirBolaForaDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirBola(0, 4);		
		assertFalse(retornoDoInserirXis);					
	}	
	
	@Test
	public void testDeveInserirBolaDentroDaMatrizI() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(2, 0);		
		assertTrue(retornoDoInserirXis);					
	}

	@Test
	public void testDeveInserirBolaDentroDaMatrizJ() {		
		boolean retornoDoInserirXis = jogoDaVelha.inserirXis(0, 2);		
		assertTrue(retornoDoInserirXis);					
	}
	
	@Test
	public void testDeveVerificarSeAPrimeiralinhaContemBola() {		
		boolean verificarBola = jogoDaVelha.verificarBolaPrimeiraLinha();		
		assertTrue(verificarBola);					
	}
}
