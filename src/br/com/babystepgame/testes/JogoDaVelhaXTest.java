package br.com.babystepgame.testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JogoDaVelhaXTest {
private JogoDaVelha jogoDaVelha;
	
	@Before
	public void setUp() {
		jogoDaVelha = new JogoDaVelha();
	}
	
	@Test
	public void testDeveVerificarSeAPrimeiralinhaContemSomenteBola() {		
		jogoDaVelha.inserirXis(0, 0);
		jogoDaVelha.inserirXis(0, 1);
		jogoDaVelha.inserirXis(0, 2);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeASegundalinhaContemSomenteBola() {		
		jogoDaVelha.inserirXis(1, 0);
		jogoDaVelha.inserirXis(1, 1);
		jogoDaVelha.inserirXis(1, 2);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeATerceiralinhaContemSomenteBola() {		
		jogoDaVelha.inserirXis(2, 0);
		jogoDaVelha.inserirXis(2, 1);
		jogoDaVelha.inserirXis(2, 2);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}	
	
	@Test
	public void testDeveVerificarSeAPrimeiraColunaContemSomenteBola() {		
		jogoDaVelha.inserirXis(0, 0);
		jogoDaVelha.inserirXis(1, 0);
		jogoDaVelha.inserirXis(2, 0);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeASegundaColunaContemSomenteBola() {		
		jogoDaVelha.inserirXis(0, 1);
		jogoDaVelha.inserirXis(1, 1);
		jogoDaVelha.inserirXis(2, 1);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeATerceiraColunaContemSomenteBola() {		
		jogoDaVelha.inserirXis(0, 2);
		jogoDaVelha.inserirXis(1, 2);
		jogoDaVelha.inserirXis(2, 2);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}
	
	
	@Test
	public void testDeveVerificarSeAPrimeiraDiagonal() {		
		jogoDaVelha.inserirXis(0, 0);
		jogoDaVelha.inserirXis(1, 1);
		jogoDaVelha.inserirXis(2, 2);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}
	
	@Test
	public void testDeveVerificarSeASegundaDiagonal() {		
		jogoDaVelha.inserirXis(0, 2);
		jogoDaVelha.inserirXis(1, 1);
		jogoDaVelha.inserirXis(2, 0);
		
		boolean verificarBola = jogoDaVelha.verificaXisBola();		
		assertTrue(verificarBola);
	}	
}
