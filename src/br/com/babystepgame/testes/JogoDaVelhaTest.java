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
	public void testDeveInserirUmaMatrizVazia() {		
		assertEquals(0, jogoDaVelha.inserirValorNaMatriz());				
	}

}
